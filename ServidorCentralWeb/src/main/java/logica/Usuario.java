/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
import java.util.Collection;
import datatypes.DataUsuario;
import jakarta.persistence.CascadeType;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.xml.bind.annotation.XmlTransient;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



/**
 *
 * @author dokgo
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {
    
    @Id
    protected String nickname;
    
    protected String password;
    protected String nombre;
    protected String apellido;
    
    @Column(unique = true)
    protected String email;
    
    protected LocalDate fechaNac;
    protected String imagenPerfil;
    protected String tipo;
    //album

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "usuario_siguiendo",
    joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns = @JoinColumn(name = "siguiendo_id"))
    @XmlTransient
    private Set<Usuario> siguiendo = new HashSet<>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "siguiendo", cascade = CascadeType.PERSIST)
    @XmlTransient
    private Set<Usuario> seguidores = new HashSet<>();

    public boolean permiteSeguir() {
        return this instanceof Cliente;
    }

//    public void seguir(Usuario usuario) {
//        if (permiteSeguir()) {
//            this.siguiendo.add(usuario);
//        } else {
//            throw new UnsupportedOperationException("Este tipo de usuario no puede seguir a otros");
//        }
//    }
//    
//    public void dejarDeSeguir(Usuario usuario) {
//        if (permiteSeguir()) {
//            this.siguiendo.remove(usuario);
//        } else {
//            throw new UnsupportedOperationException("Este tipo de usuario no puede dejar de seguir");
//        }
//    }

    public Set<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Set<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    
    public void setSiguiendo(Set<Usuario> siguiendo) {
        this.siguiendo = siguiendo;
    }
    
    
    public Set<Usuario> getSiguiendo() {
        return siguiendo;
    }
    
    public void seguirUsuario(Usuario usuarioASeguir) {
        if (this.permiteSeguir() && usuarioASeguir.permiteSeguir()) {
            this.siguiendo.add(usuarioASeguir);
            usuarioASeguir.getSeguidores().add(this);
        }
    }

    
    public Usuario(){};

//    public Usuario(String nickname, String nombre, String apellido, String email, LocalDate fechaNac, String imagenPerfil, String tipo) {
//        this.nickname = nickname;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.email = email;
//        this.fechaNac = fechaNac;
//        this.imagenPerfil = imagenPerfil;
//        this.tipo = tipo;   
//    }
    
    public Usuario(String nickname, String nombre, String apellido, String password, String email, LocalDate fechaNac, String imagenPerfil, String tipo) {
        this.nickname = nickname;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.imagenPerfil = imagenPerfil;
        this.tipo = tipo;
        
    }
    

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public DataUsuario devolverData(){
        return new DataUsuario(getNickname(), getNombre(), getApellido(), getEmail(), getFechaNac(), getImagenPerfil(), null, null);
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nickname, usuario.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    
}


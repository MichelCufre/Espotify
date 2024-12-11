/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datatypes.DataArtistaEliminado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dokgo
 * 
 */

@Entity
public class ArtistaEliminado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nickname;
    
    private String nombre;
    private String apellido;
    
    
    private String email;
    
    private LocalDate fechaNac;
    private String imagenPerfil;
    @Column(length = 500)
    private String biografia;
    private String sitioWeb;
    private LocalDate fechaEliminado;

    

    @OneToMany(mappedBy = "artista")
    private List<AlbumEliminado> albums = new ArrayList<>(); // Relación uno a muchos con AlbumEliminado

    // Constructor vacío para JPA
    public ArtistaEliminado() {}

    // Constructor sin colecciones
    public ArtistaEliminado(String nickname, String nombre, String apellido, String email, LocalDate fechaNac, String imagenPerfil, String biografia, String sitioWeb) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.imagenPerfil = imagenPerfil;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
    }
    
    public ArtistaEliminado(String nickname, String nombre, String apellido, String email, String imagenPerfil, String biografia, String sitioWeb) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imagenPerfil = imagenPerfil;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
    }
    

    public int getId() {
        return id;
    }
  
    public LocalDate getFechaEliminado() {
        return fechaEliminado;
    }

    public void setFechaEliminado(LocalDate fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
    }
    
    // Getters y setters
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

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public List<AlbumEliminado> getAlbums() {
        return albums;
    }

    public void setAlbums(List<AlbumEliminado> albums) {
        this.albums = albums;
    }
    
    public DataArtistaEliminado devolverData() {
    DataArtistaEliminado dataArtista = new DataArtistaEliminado(getId(),getNickname(), getNombre(), getApellido(), getEmail(), getFechaNac(), getImagenPerfil(), getBiografia(), getSitioWeb(), getAlbums(), getFechaEliminado());
    return dataArtista;
    }
}

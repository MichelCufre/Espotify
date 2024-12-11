/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;


import controladores.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author dokgo
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DataUsuario implements Serializable {
    @XmlElement
    private String nick;
    @XmlElement
    private String nombre;
    @XmlElement
    private String apellido;
    @XmlElement
    private String correo;
    @XmlElement
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate fechaNac;
    @XmlElement
    private String biografia;
    @XmlElement
    private String sitioWeb;
    @XmlElement
    private String imagen;
    @XmlElement
    private String tipo;

    public DataUsuario(){}
    
    public DataUsuario(String nick, String nombre, String apellido, String correo, LocalDate fechaNac, String imagenP, String biografia, String sitioWeb) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.imagen = imagenP;
        
    }
    
    public DataUsuario(String nick, String nombre, String apellido, String correo, LocalDate fechaNac, String imagenP) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.imagen = imagenP;
        
    }
    
    public DataUsuario(String nick, String nombre, String apellido, String correo, LocalDate fechaNac, String imagenP, String biografia, String sitioWeb, String tipo) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.imagen = imagenP;
        this.tipo = tipo;
        
    }
    
    public DataUsuario(String nick, String nombre, String apellido, String correo, String imagenP, String biografia, String sitioWeb, String tipo) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.imagen = imagenP;
        this.tipo = tipo;
        
    }
    
    public DataUsuario(String nick, String nombre, String apellido, String correo, LocalDate fechaNac, String imagenP, String tipo) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.imagen = imagenP;
        this.tipo = tipo;
        
    }
    
    public DataUsuario(String nick, String nombre, String apellido, String correo, String imagenP, String tipo) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.imagen = imagenP;
        this.tipo = tipo;
        
    }
    
    public DataUsuario(String nick, String nombre){
        this.nick = nick;
        this.nombre = nombre;
    }
    
    

    public String getNick() {
        return nick;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public String getImagen() {
        return imagen;
    }

//    public void setImagen(String imagen) {
//        this.imagen = imagen;
//    }

    public String getTipo() {
        return tipo;
    }

//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
    
    
    
}


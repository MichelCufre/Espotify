/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import logica.AlbumEliminado;

/**
 *
 * @author dokgo
 */
public class DataArtistaEliminado {
    
    private int id;
    
    private String nickname;
    
    private String nombre;
    private String apellido;
    
    
    private String email;
    
    private LocalDate fechaNac;
    private String imagenPerfil;
    private String biografia;
    private String sitioWeb;
    private LocalDate fechaEliminado;
    
    private List<AlbumEliminado> albums = new ArrayList<>();
    
    public DataArtistaEliminado(int id,String nickname, String nombre, String apellido, String email, LocalDate fechaNac, String imagenPerfil, String biografia, String sitioWeb, List<AlbumEliminado> albums, LocalDate fechaEliminado) {
        this.id = id;
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.imagenPerfil = imagenPerfil;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.albums = albums;
        this.fechaEliminado = fechaEliminado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getFechaEliminado() {
        return fechaEliminado;
    }

    public void setFechaEliminado(LocalDate fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
    }

    public List<AlbumEliminado> getAlbums() {
        return albums;
    }

    public void setAlbums(List<AlbumEliminado> albums) {
        this.albums = albums;
    }
    
    
    
}

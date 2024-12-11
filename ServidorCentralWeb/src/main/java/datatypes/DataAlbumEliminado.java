/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dokgo
 */
public class DataAlbumEliminado {
    
    private Long id;
    private String nombre;
    private Integer fechaCreacion;
    private String imagenAlbum;
    private String nombreArtista; // Nombre del artista en lugar del objeto completo
    private List<DataTemaEliminado> temas = new ArrayList<>(); // Lista de nombres de los temas en lugar de los objetos completos

    // Constructor vacío
    public DataAlbumEliminado() {}

    // Constructor que inicializa los campos
    public DataAlbumEliminado(Long id, String nombre, Integer fechaCreacion, String imagenAlbum, String nombreArtista, List<DataTemaEliminado> temas) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.imagenAlbum = imagenAlbum;
        this.nombreArtista = nombreArtista;
        this.temas = temas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Integer fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getImagenAlbum() {
        return imagenAlbum;
    }

    public void setImagenAlbum(String imagenAlbum) {
        this.imagenAlbum = imagenAlbum;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public List<DataTemaEliminado> getTemas() {
        return temas;
    }

    public void setTemas(List<DataTemaEliminado> temas) {
        this.temas = temas;
    }
 
    
}

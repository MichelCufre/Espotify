/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author dokgo
 */
import jakarta.persistence.CascadeType;
import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class AlbumEliminado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private Integer fechaCreacion;
    private String imagenAlbum;
    
    @ManyToOne
    @JoinColumn(name = "artista_nombre")
    private ArtistaEliminado artista; // Relación muchos a uno con ArtistaEliminado

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TemaEliminado> temas = new ArrayList<>(); // Relación uno a muchos con TemaEliminado

    // Constructor vacío para JPA
    public AlbumEliminado() {}

    // Constructor sin colecciones
    public AlbumEliminado(String nombre, Integer fechaCreacion, String imagenAlbum) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.imagenAlbum = imagenAlbum;
    }

    // Getters y setters
    public Long getId() {
        return id;
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

    public ArtistaEliminado getArtista() {
        return artista;
    }

    public void setArtista(ArtistaEliminado artista) {
        this.artista = artista;
//        if(artista != null && !artista.getAlbums().contains(this)){
            artista.getAlbums().add(this);
//        }
    }

    public List<TemaEliminado> getTemas() {
        return temas;
    }

    public void setTemas(List<TemaEliminado> temas) {
        this.temas = temas;
    }
}
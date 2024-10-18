
package datatypes;

import java.time.LocalDate;
import java.util.Collection;

public class DataAlbum {
    private Long id;
    private String nombre;
    private Integer fechaCreacion;
    private String ImagenAlbum;
    private Collection<DataTema> Temas;
    private Collection<String> Generos;

    public DataAlbum(String nombre, Integer fechaCreacion, String imagen, Collection<DataTema> temas, Collection<String> generos) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.ImagenAlbum = imagen;
        this.Temas = temas;
        this.Generos = generos;
    }
    
    public DataAlbum(Long id ,String nombre, Integer fechaCreacion, String imagen, Collection<DataTema> temas, Collection<String> generos) {
        this.id=id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.ImagenAlbum = imagen;
        this.Temas = temas;
        this.Generos = generos;
    }
    
    public DataAlbum(){}

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(Integer fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setImagenAlbum(String ImagenAlbum) {
        this.ImagenAlbum = ImagenAlbum;
    }

    public void setTemas(Collection<DataTema> Temas) {
        this.Temas = Temas;
    }

    public void setGeneros(Collection<String> Generos) {
        this.Generos = Generos;
    }

    public Long getId() {
        return id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Integer getFechaCreacion(){
        return this.fechaCreacion;
    }
    
    public String getImagenAlbum(){
        return this.ImagenAlbum;
    }
    
    public Collection<DataTema> getTemas(){
        return this.Temas;
    }
    
    public Collection<String> getGeneros(){
        return this.Generos;
    }
    
     public String toString(){
        return nombre;
}
}

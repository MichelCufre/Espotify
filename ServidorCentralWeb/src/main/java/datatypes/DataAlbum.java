
package datatypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DataAlbum implements Serializable{
    @XmlElement
    private Long id;
    @XmlElement
    private String nombre;
    @XmlElement
    private Integer fechaCreacion;
    @XmlElement
    private String ImagenAlbum;
    @XmlElement
    private String nombreArt;
    @XmlElement
    private Collection<DataTema> Temas;
    @XmlElement
    private Collection<String> Generos;

    public DataAlbum(String nombre, Integer fechaCreacion, String imagen, Collection<DataTema> temas, Collection<String> generos, String nombreArt) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.ImagenAlbum = imagen;
        this.Temas = temas;
        this.Generos = generos;
        this.nombreArt = nombreArt;
    }
    
    public DataAlbum(Long id ,String nombre, Integer fechaCreacion, String imagen, Collection<DataTema> temas, Collection<String> generos, String nombreArt) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.ImagenAlbum = imagen;
        this.Temas = temas;
        this.Generos = generos;
        this.nombreArt = nombreArt;
    }
    
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

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Comparación de referencia
        if (!(obj instanceof DataAlbum)) return false; // Verificar tipo
        DataAlbum other = (DataAlbum) obj; // Hacer un cast

        // Comparar atributos
        return this.nombre.equals(other.nombre) && this.fechaCreacion == other.fechaCreacion;
    }

    // Implementación de hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaCreacion); // Generar hash basado en atributos
    }
    
}

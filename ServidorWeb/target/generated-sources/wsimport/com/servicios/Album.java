
package com.servicios;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para album complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="album"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="artista" type="{http://servicios.com/}artista" minOccurs="0"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="imagenAlbum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temas" type="{http://servicios.com/}tema" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "album", propOrder = {
    "artista",
    "fechaCreacion",
    "id",
    "imagenAlbum",
    "nombre",
    "temas"
})
public class Album {

    protected Artista artista;
    protected Integer fechaCreacion;
    protected Long id;
    protected String imagenAlbum;
    protected String nombre;
    @XmlElement(nillable = true)
    protected List<Tema> temas;

    /**
     * Obtiene el valor de la propiedad artista.
     * 
     * @return
     *     possible object is
     *     {@link Artista }
     *     
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * Define el valor de la propiedad artista.
     * 
     * @param value
     *     allowed object is
     *     {@link Artista }
     *     
     */
    public void setArtista(Artista value) {
        this.artista = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFechaCreacion(Integer value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenAlbum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagenAlbum() {
        return imagenAlbum;
    }

    /**
     * Define el valor de la propiedad imagenAlbum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagenAlbum(String value) {
        this.imagenAlbum = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the temas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the temas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tema }
     * 
     * 
     */
    public List<Tema> getTemas() {
        if (temas == null) {
            temas = new ArrayList<Tema>();
        }
        return this.temas;
    }

}

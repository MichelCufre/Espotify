
package com.servicios;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dataAlbum complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dataAlbum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ImagenAlbum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreArt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Temas" type="{http://servicios.com/}dataTema" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Generos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataAlbum", propOrder = {
    "id",
    "nombre",
    "fechaCreacion",
    "imagenAlbum",
    "nombreArt",
    "temas",
    "generos"
})
public class DataAlbum {

    protected Long id;
    protected String nombre;
    protected Integer fechaCreacion;
    @XmlElement(name = "ImagenAlbum")
    protected String imagenAlbum;
    protected String nombreArt;
    @XmlElement(name = "Temas")
    protected List<DataTema> temas;
    @XmlElement(name = "Generos")
    protected List<String> generos;

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
     * Obtiene el valor de la propiedad nombreArt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArt() {
        return nombreArt;
    }

    /**
     * Define el valor de la propiedad nombreArt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArt(String value) {
        this.nombreArt = value;
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
     * {@link DataTema }
     * 
     * 
     */
    public List<DataTema> getTemas() {
        if (temas == null) {
            temas = new ArrayList<DataTema>();
        }
        return this.temas;
    }

    /**
     * Gets the value of the generos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGeneros() {
        if (generos == null) {
            generos = new ArrayList<String>();
        }
        return this.generos;
    }

}

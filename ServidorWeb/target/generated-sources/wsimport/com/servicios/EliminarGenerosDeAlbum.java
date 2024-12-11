
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarGenerosDeAlbum complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarGenerosDeAlbum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="album" type="{http://servicios.com/}album" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarGenerosDeAlbum", propOrder = {
    "album"
})
public class EliminarGenerosDeAlbum {

    protected Album album;

    /**
     * Obtiene el valor de la propiedad album.
     * 
     * @return
     *     possible object is
     *     {@link Album }
     *     
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Define el valor de la propiedad album.
     * 
     * @param value
     *     allowed object is
     *     {@link Album }
     *     
     */
    public void setAlbum(Album value) {
        this.album = value;
    }

}

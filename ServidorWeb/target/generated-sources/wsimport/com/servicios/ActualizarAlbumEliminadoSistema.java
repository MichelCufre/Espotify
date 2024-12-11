
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarAlbumEliminadoSistema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarAlbumEliminadoSistema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlbumE" type="{http://servicios.com/}albumEliminado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarAlbumEliminadoSistema", propOrder = {
    "albumE"
})
public class ActualizarAlbumEliminadoSistema {

    @XmlElement(name = "AlbumE")
    protected AlbumEliminado albumE;

    /**
     * Obtiene el valor de la propiedad albumE.
     * 
     * @return
     *     possible object is
     *     {@link AlbumEliminado }
     *     
     */
    public AlbumEliminado getAlbumE() {
        return albumE;
    }

    /**
     * Define el valor de la propiedad albumE.
     * 
     * @param value
     *     allowed object is
     *     {@link AlbumEliminado }
     *     
     */
    public void setAlbumE(AlbumEliminado value) {
        this.albumE = value;
    }

}


package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarArtistaEliminado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarArtistaEliminado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtistaE" type="{http://servicios.com/}artistaEliminado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarArtistaEliminado", propOrder = {
    "artistaE"
})
public class ActualizarArtistaEliminado {

    @XmlElement(name = "ArtistaE")
    protected ArtistaEliminado artistaE;

    /**
     * Obtiene el valor de la propiedad artistaE.
     * 
     * @return
     *     possible object is
     *     {@link ArtistaEliminado }
     *     
     */
    public ArtistaEliminado getArtistaE() {
        return artistaE;
    }

    /**
     * Define el valor de la propiedad artistaE.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtistaEliminado }
     *     
     */
    public void setArtistaE(ArtistaEliminado value) {
        this.artistaE = value;
    }

}

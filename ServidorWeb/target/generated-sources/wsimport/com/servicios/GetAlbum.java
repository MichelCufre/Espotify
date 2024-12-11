
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAlbum complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAlbum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlbum", propOrder = {
    "nombreA"
})
public class GetAlbum {

    protected String nombreA;

    /**
     * Obtiene el valor de la propiedad nombreA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreA() {
        return nombreA;
    }

    /**
     * Define el valor de la propiedad nombreA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreA(String value) {
        this.nombreA = value;
    }

}

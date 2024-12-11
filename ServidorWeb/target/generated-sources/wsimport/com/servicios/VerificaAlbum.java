
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificaAlbum complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificaAlbum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreArtista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaAlbum", propOrder = {
    "nombreA",
    "nombreArtista"
})
public class VerificaAlbum {

    protected String nombreA;
    protected String nombreArtista;

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

    /**
     * Obtiene el valor de la propiedad nombreArtista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArtista() {
        return nombreArtista;
    }

    /**
     * Define el valor de la propiedad nombreArtista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArtista(String value) {
        this.nombreArtista = value;
    }

}

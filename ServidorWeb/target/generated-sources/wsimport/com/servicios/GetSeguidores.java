
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getSeguidores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getSeguidores"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nicknameArtista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSeguidores", propOrder = {
    "nicknameArtista"
})
public class GetSeguidores {

    protected String nicknameArtista;

    /**
     * Obtiene el valor de la propiedad nicknameArtista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNicknameArtista() {
        return nicknameArtista;
    }

    /**
     * Define el valor de la propiedad nicknameArtista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNicknameArtista(String value) {
        this.nicknameArtista = value;
    }

}

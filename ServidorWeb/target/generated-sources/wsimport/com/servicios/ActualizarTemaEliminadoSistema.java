
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarTemaEliminadoSistema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarTemaEliminadoSistema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemaE" type="{http://servicios.com/}temaEliminado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarTemaEliminadoSistema", propOrder = {
    "temaE"
})
public class ActualizarTemaEliminadoSistema {

    @XmlElement(name = "TemaE")
    protected TemaEliminado temaE;

    /**
     * Obtiene el valor de la propiedad temaE.
     * 
     * @return
     *     possible object is
     *     {@link TemaEliminado }
     *     
     */
    public TemaEliminado getTemaE() {
        return temaE;
    }

    /**
     * Define el valor de la propiedad temaE.
     * 
     * @param value
     *     allowed object is
     *     {@link TemaEliminado }
     *     
     */
    public void setTemaE(TemaEliminado value) {
        this.temaE = value;
    }

}

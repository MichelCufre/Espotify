
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para traerTemasPorListasPorDefectoId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="traerTemasPorListasPorDefectoId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traerTemasPorListasPorDefectoId", propOrder = {
    "listaid"
})
public class TraerTemasPorListasPorDefectoId {

    protected int listaid;

    /**
     * Obtiene el valor de la propiedad listaid.
     * 
     */
    public int getListaid() {
        return listaid;
    }

    /**
     * Define el valor de la propiedad listaid.
     * 
     */
    public void setListaid(int value) {
        this.listaid = value;
    }

}

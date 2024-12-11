
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para esPublicaLista complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="esPublicaLista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idLista" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esPublicaLista", propOrder = {
    "idLista"
})
public class EsPublicaLista {

    protected int idLista;

    /**
     * Obtiene el valor de la propiedad idLista.
     * 
     */
    public int getIdLista() {
        return idLista;
    }

    /**
     * Define el valor de la propiedad idLista.
     * 
     */
    public void setIdLista(int value) {
        this.idLista = value;
    }

}

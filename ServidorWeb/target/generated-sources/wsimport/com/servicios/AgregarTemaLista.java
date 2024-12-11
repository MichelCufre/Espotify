
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarTemaLista complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarTemaLista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idLista" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTema" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarTemaLista", propOrder = {
    "idLista",
    "idTema"
})
public class AgregarTemaLista {

    protected int idLista;
    protected Long idTema;

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

    /**
     * Obtiene el valor de la propiedad idTema.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTema() {
        return idTema;
    }

    /**
     * Define el valor de la propiedad idTema.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTema(Long value) {
        this.idTema = value;
    }

}


package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarTemasListaPart complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarTemasListaPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "eliminarTemasListaPart", propOrder = {
    "nombre",
    "nombreL",
    "idTema"
})
public class EliminarTemasListaPart {

    protected String nombre;
    protected String nombreL;
    protected Long idTema;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreL() {
        return nombreL;
    }

    /**
     * Define el valor de la propiedad nombreL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreL(String value) {
        this.nombreL = value;
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

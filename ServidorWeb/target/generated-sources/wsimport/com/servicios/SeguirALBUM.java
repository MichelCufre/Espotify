
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Seguir_ALBUM complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Seguir_ALBUM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente_seleccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="album_seleccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seguir_ALBUM", propOrder = {
    "clienteSeleccionado",
    "albumSeleccionado"
})
public class SeguirALBUM {

    @XmlElement(name = "cliente_seleccionado")
    protected String clienteSeleccionado;
    @XmlElement(name = "album_seleccionado")
    protected String albumSeleccionado;

    /**
     * Obtiene el valor de la propiedad clienteSeleccionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    /**
     * Define el valor de la propiedad clienteSeleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteSeleccionado(String value) {
        this.clienteSeleccionado = value;
    }

    /**
     * Obtiene el valor de la propiedad albumSeleccionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlbumSeleccionado() {
        return albumSeleccionado;
    }

    /**
     * Define el valor de la propiedad albumSeleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlbumSeleccionado(String value) {
        this.albumSeleccionado = value;
    }

}

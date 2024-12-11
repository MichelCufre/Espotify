
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Seguir_Usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Seguir_Usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente_seleccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nickname_usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seguir_Usuario", propOrder = {
    "clienteSeleccionado",
    "nicknameUsuario"
})
public class SeguirUsuario {

    @XmlElement(name = "cliente_seleccionado")
    protected String clienteSeleccionado;
    @XmlElement(name = "nickname_usuario")
    protected String nicknameUsuario;

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
     * Obtiene el valor de la propiedad nicknameUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNicknameUsuario() {
        return nicknameUsuario;
    }

    /**
     * Define el valor de la propiedad nicknameUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNicknameUsuario(String value) {
        this.nicknameUsuario = value;
    }

}

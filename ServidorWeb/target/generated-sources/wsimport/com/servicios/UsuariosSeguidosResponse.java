
package com.servicios;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuariosSeguidosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuariosSeguidosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="artistas" type="{http://servicios.com/}dataUsuario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clientes" type="{http://servicios.com/}dataUsuario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuariosSeguidosResponse", propOrder = {
    "artistas",
    "clientes"
})
public class UsuariosSeguidosResponse {

    protected List<DataUsuario> artistas;
    protected List<DataUsuario> clientes;

    /**
     * Gets the value of the artistas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the artistas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtistas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataUsuario }
     * 
     * 
     */
    public List<DataUsuario> getArtistas() {
        if (artistas == null) {
            artistas = new ArrayList<DataUsuario>();
        }
        return this.artistas;
    }

    /**
     * Gets the value of the clientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataUsuario }
     * 
     * 
     */
    public List<DataUsuario> getClientes() {
        if (clientes == null) {
            clientes = new ArrayList<DataUsuario>();
        }
        return this.clientes;
    }

}

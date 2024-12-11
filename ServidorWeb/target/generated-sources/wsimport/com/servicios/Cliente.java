
package com.servicios;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicios.com/}usuario"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="albumesFavoritos" type="{http://servicios.com/}album" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listasDeCliente" type="{http://servicios.com/}listaParticular" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listasFavoritas" type="{http://servicios.com/}listaReproduccion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sub" type="{http://servicios.com/}subscripcion" minOccurs="0"/&gt;
 *         &lt;element name="temasFavoritos" type="{http://servicios.com/}tema" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "albumesFavoritos",
    "listasDeCliente",
    "listasFavoritas",
    "sub",
    "temasFavoritos"
})
public class Cliente
    extends Usuario
{

    @XmlElement(nillable = true)
    protected List<Album> albumesFavoritos;
    @XmlElement(nillable = true)
    protected List<ListaParticular> listasDeCliente;
    @XmlElement(nillable = true)
    protected List<ListaReproduccion> listasFavoritas;
    protected Subscripcion sub;
    @XmlElement(nillable = true)
    protected List<Tema> temasFavoritos;

    /**
     * Gets the value of the albumesFavoritos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the albumesFavoritos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlbumesFavoritos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Album }
     * 
     * 
     */
    public List<Album> getAlbumesFavoritos() {
        if (albumesFavoritos == null) {
            albumesFavoritos = new ArrayList<Album>();
        }
        return this.albumesFavoritos;
    }

    /**
     * Gets the value of the listasDeCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listasDeCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListasDeCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaParticular }
     * 
     * 
     */
    public List<ListaParticular> getListasDeCliente() {
        if (listasDeCliente == null) {
            listasDeCliente = new ArrayList<ListaParticular>();
        }
        return this.listasDeCliente;
    }

    /**
     * Gets the value of the listasFavoritas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listasFavoritas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListasFavoritas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaReproduccion }
     * 
     * 
     */
    public List<ListaReproduccion> getListasFavoritas() {
        if (listasFavoritas == null) {
            listasFavoritas = new ArrayList<ListaReproduccion>();
        }
        return this.listasFavoritas;
    }

    /**
     * Obtiene el valor de la propiedad sub.
     * 
     * @return
     *     possible object is
     *     {@link Subscripcion }
     *     
     */
    public Subscripcion getSub() {
        return sub;
    }

    /**
     * Define el valor de la propiedad sub.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscripcion }
     *     
     */
    public void setSub(Subscripcion value) {
        this.sub = value;
    }

    /**
     * Gets the value of the temasFavoritos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the temasFavoritos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemasFavoritos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tema }
     * 
     * 
     */
    public List<Tema> getTemasFavoritos() {
        if (temasFavoritos == null) {
            temasFavoritos = new ArrayList<Tema>();
        }
        return this.temasFavoritos;
    }

}

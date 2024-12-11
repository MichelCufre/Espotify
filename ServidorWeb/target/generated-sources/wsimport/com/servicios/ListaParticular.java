
package com.servicios;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaParticular complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaParticular"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicios.com/}listaReproduccion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publica" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaParticular", propOrder = {
    "publica"
})
public class ListaParticular
    extends ListaReproduccion
{

    protected boolean publica;

    /**
     * Obtiene el valor de la propiedad publica.
     * 
     */
    public boolean isPublica() {
        return publica;
    }

    /**
     * Define el valor de la propiedad publica.
     * 
     */
    public void setPublica(boolean value) {
        this.publica = value;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import logica.ListaParticular;
import logica.ListaPorDefecto;
import logica.Tema;

/**
 *
 * @author frank
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DataLista implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
    private String nombre,imagen,extra;
    @XmlElement
    private Set<DataTema> temas;
    @XmlElement
    private Set<String> temass;
    @XmlElement
    private String cliente;
    @XmlElement
    private boolean publica;

    public DataLista(ListaPorDefecto ld) {
        this.id=ld.getId();
        this.nombre = ld.getNombre();
        this.imagen = ld.getImagen();
        this.extra = ld.getGenero();
        this.temas = new HashSet<>();
        for(Tema t: ld.getListaTemas()){
            temas.add(new DataTema(t));
        }
        this.publica = true;
    }
    
    public DataLista(ListaParticular ld){
        this.id=ld.getId();
        this.nombre = ld.getNombre();
        this.imagen = ld.getImagen();
        this.extra = ld.getCliente();
        this.temas = new HashSet<>();
        for(Tema t: ld.getListaTemas()){
            temas.add(new DataTema(t));
        }
        this.cliente = ld.getCliente();
        this.publica = ld.esPublica();
    }
    
    public DataLista(String nom, String ima, String extra){
        this.nombre = nom;
        this.imagen = ima;
        this.extra = extra;
        this.temas = new HashSet<>();
    }
    
    public DataLista(){
        
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Set<DataTema> getTemas() {
        return temas;
    }
    
     public String toString(){
        return nombre;
}
    
    public void eliminarTema(Long idTema) {
    temas.removeIf(temas -> temas.getId() == idTema);
    }

    public boolean isEstado() {
        return publica;
    }
}
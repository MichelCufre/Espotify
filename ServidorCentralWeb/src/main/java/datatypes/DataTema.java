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
import logica.Tema;

/**
 *
 * @author miche
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DataTema implements Serializable {
    @XmlElement
    private Long id;
    @XmlElement
    private String nombre;
    @XmlElement
    private String duracion;
    @XmlElement
    private Integer posicion;
    @XmlElement
    private String direccionWeb;
    @XmlElement
    private String archivo;
    @XmlElement
    private Integer nroDescargas = 0;
    @XmlElement
    private Integer nroLikes = 0;
    @XmlElement
    private Integer nroListas = 0;
    @XmlElement
    private Integer nroReproducciones = 0;

   

    public DataTema() {}

    public DataTema(String nombre, String duracion, Integer posicion, String direccionWeb, String archivo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.posicion = posicion;
        this.direccionWeb = direccionWeb;
        this.archivo = archivo;
    }
    
    public DataTema(Long id , String nombre, String duracion, Integer posicion, String direccionWeb, String archivo) {
        this.id= id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.posicion = posicion;
        this.direccionWeb = direccionWeb;
        this.archivo = archivo;
    }
    
    public DataTema(Tema t){
        this.id = t.getId();
        this.nombre = t.getNombre();
        this.duracion = t.getDuracion();
        this.posicion = t.getPosicion();
        this.direccionWeb = t.getDireccionWeb();
        this.archivo = t.getArchivo();
    }
    
    public DataTema(Long id , String nombre, String duracion, Integer posicion, String direccionWeb, String archivo, Integer descargas, Integer repro, Integer listas, Integer likes) {
        this.id= id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.posicion = posicion;
        this.direccionWeb = direccionWeb;
        this.archivo = archivo;
        this.nroDescargas = descargas;
        this.nroReproducciones = repro;
        this.nroListas = listas;
        this.nroLikes = likes;
    }
     
    public Long getId() {
        return id;
    }
        public String getNombre() {
        return nombre;
    }


    public String getDuracion() {
        return duracion;
    }

    
     public Integer getPosicion() {
        return posicion;
    }


    public String getDireccionWeb() {
        return direccionWeb;
    }


    public String getArchivo() {
        return archivo;
    }

    public Integer getNroDescargas() {
        return nroDescargas;
    }

    public Integer getNroLikes() {
        return nroLikes;
    }

    public Integer getNroListas() {
        return nroListas;
    }

    public Integer getNroReproducciones() {
        return nroReproducciones;
    }
    
    

}

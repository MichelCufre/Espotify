/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import logica.AlbumEliminado;

/**
 *
 * @author dokgo
 */
public class DataTemaEliminado {
    
    private Long id;
    
    private String nombre;
    private String duracion;
    private Integer posicion;
    private String direccionWeb;
    private String archivo;
    

    private AlbumEliminado album;
    
    public DataTemaEliminado(String nombre, String duracion, Integer posicion, String direccionWeb, String archivo, AlbumEliminado album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.posicion = posicion;
        this.direccionWeb = direccionWeb;
        this.archivo = archivo;
        this.album = album;
    }
    
    public DataTemaEliminado(String nombre, String duracion, Integer posicion, String direccionWeb, String archivo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.posicion = posicion;
        this.direccionWeb = direccionWeb;
        this.archivo = archivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public AlbumEliminado getAlbum() {
        return album;
    }

    public void setAlbum(AlbumEliminado album) {
        this.album = album;
    }
      
}

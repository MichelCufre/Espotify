/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

/**
 *
 * @author dokgo
 */
import datatypes.DataUsuario;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class UsuariosSeguidosResponse {
    private ArrayList<DataUsuario> clientes;
    private ArrayList<DataUsuario> artistas;

    public UsuariosSeguidosResponse() {
        this.clientes = new ArrayList<>();
        this.artistas = new ArrayList<>();
    }

    @XmlElement
    public ArrayList<DataUsuario> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<DataUsuario> clientes) {
        this.clientes = clientes;
    }

    @XmlElement
    public ArrayList<DataUsuario> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<DataUsuario> artistas) {
        this.artistas = artistas;
    }
}


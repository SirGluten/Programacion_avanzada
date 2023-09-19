/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2act2.Modelo;

import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class Area {
    private  static Integer idCount = 1;
    private Integer id;
    private String nomarea;
    private String telefono;
    private ArrayList<Documento> listaDocumentos = new ArrayList<Documento>();

    public Area(String nomarea, String telefono) {
        this.id = idCount;
        aumentarStatic();
        this.nomarea = nomarea;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomarea() {
        return nomarea;
    }

    public void setNomarea(String nomarea) {
        this.nomarea = nomarea;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Documento> getListaDocumentos() {
        return listaDocumentos;
    }

    public void setListaDocumentos(ArrayList<Documento> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }
    
    public void addDocumento(Documento d){
        this.listaDocumentos.add(d);
    }
    
    private void aumentarStatic(){
        idCount ++;
    }
}

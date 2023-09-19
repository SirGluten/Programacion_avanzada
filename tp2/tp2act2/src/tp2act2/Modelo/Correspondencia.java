/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2act2.Modelo;

import java.util.Date;

/**
 *
 * @author nicol
 */
public class Correspondencia extends Documento {
    
    private String remitente;
    private String direccion;
    
    public Correspondencia(String remitente, String direccion, Date fechacreacion) {
        super(fechacreacion);
        this.remitente = remitente;
        this.direccion = direccion;
    }
    
    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //@Override
    public void imprimirDatosHijo(){
        System.out.print("Correspondencia: "+this.getDireccion() + " " +this.getRemitente());
    }

    @Override
    public String imprimirDatosHijoV() {
        return ("Correspondencia: "+ this.getDireccion() + " " +this.getRemitente());
    }
    
}

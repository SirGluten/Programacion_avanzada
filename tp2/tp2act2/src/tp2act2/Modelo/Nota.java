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
public class Nota extends Documento{
    private static Integer numCount = 1; 
   private Integer nro;
    private Integer año;
    private String asunto;
    

    public Nota(String asunto, Date fechacreacion) {
        super(fechacreacion);
        this.año = this.getFechacreacion().getYear();
        this.asunto = asunto;
        this.nro = numCount;
        aumentarStatic();
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
   @Override
    public void imprimirDatosHijo(){
        System.out.print("nota nro: " + this.getNro() + " año: " + this.getAño() + " asunto: " + this.getAsunto());
    }

    @Override
    public String imprimirDatosHijoV() {
        return ("nota nro: " + this.getNro() + " año: " + this.getAño() + " asunto: " + this.getAsunto());
    }
    
        private void aumentarStatic(){
        numCount ++;
    }
}

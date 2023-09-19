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
public class Expediente extends Documento{
    private static Integer nroCount = 1; 
    private Integer nro;
    private String letra;
    private Integer año;
    private String anexo;

    public Expediente(String letra, String anexo, Date fechacreacion) {
        super(fechacreacion);
        this.año = this.getFechacreacion().getYear();
        this.letra = letra;
        this.anexo = anexo;
        this.nro = nroCount;
        aumentarStatic();
    }

    

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    @Override
    public void imprimirDatosHijo() {
        System.out.print("Expediente Nro :" + this.getNro() + " letra: " + this.getLetra()+ " anexo: " + this.getAnexo() + " año: " + this.getAño());
    }
    
    @Override
    public String imprimirDatosHijoV(){
        String s = ("Expediente Nro :" + this.getNro() + " letra: " + this.getLetra()+ " anexo: " + this.getAnexo() + " año: " + this.getAño());
        return s;
    }
    
        private void aumentarStatic(){
        nroCount ++;
    }
}

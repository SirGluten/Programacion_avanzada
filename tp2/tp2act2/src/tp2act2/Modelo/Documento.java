/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2act2.Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nicol
 */
public abstract class Documento {
    private static int numid = 1;
    private Integer idDocumento;
    private Date fechacreacion;
    ArrayList<Movimiento> mov = new ArrayList<>();

    public ArrayList<Movimiento> getMov() {
        return mov;
    }
    
    public Documento(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
        this.idDocumento = numid;
        aumentarStatic();
    }


    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    
    public void imprimir(){
        //consola
        System.out.print("IDDocumento: " + this.idDocumento + " fecha de creacion:" + this.getFechacreacion()+ " ");
        imprimirDatosHijo();
    }
    
        public String imprimirV(){
        //consola
        String txt = ("IDDocumento: " + this.idDocumento + " fecha de creacion:" + this.getFechacreacion()+ " " + imprimirDatosHijoV()+ "\n");
        return txt;
    }
    
    public abstract void imprimirDatosHijo();
    public abstract String imprimirDatosHijoV();
    
    private void aumentarStatic(){
        numid ++;
    }
    
    public void add_mov(){
        this.mov.add(new Movimiento());
    }

}

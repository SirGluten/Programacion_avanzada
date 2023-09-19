/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2act2.Modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author nicol
 */
public class Movimiento {
    
    //var
    private static Integer movCount = 0;
    private Integer id;
    private Date fechamov;
    
    //met

    public Movimiento() {
        this.id = movCount;
        aumentar_static();
        this.fechamov = new Date();
    }
    
    private void aumentar_static(){
        movCount ++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechamov() {
        return fechamov;
    }

    public void setFechamov(Date fechamov) {
        this.fechamov = fechamov;
    }
    
}

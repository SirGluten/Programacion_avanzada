/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author nicol
 */
public class Materia {
    private Integer idMat;
    private String nomMat;
    private Integer anioCursado;

    public Materia(Integer idMat, String nomMat, Integer anioCursado) {
        this.idMat = idMat;
        this.nomMat = nomMat;
        this.anioCursado = anioCursado;
    }

    public Integer getIdMat() {
        return idMat;
    }

    public void setIdMat(Integer idMat) {
        this.idMat = idMat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public Integer getAnioCursado() {
        return anioCursado;
    }

    public void setAnioCursado(Integer anioCursado) {
        this.anioCursado = anioCursado;
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class Plan {
    
    private Integer idPLan;
    private String nomPlan;
    private Integer anioInicio;
    private ArrayList<Materia> materia = new ArrayList<Materia>();

    public Plan(Integer idPLan, String nomPlan, Integer anioInicio) {
        this.idPLan = idPLan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
    }

    public Integer getIdPLan() {
        return idPLan;
    }

    public void setIdPLan(Integer idPLan) {
        this.idPLan = idPLan;
    }

    public String getNomPlan() {
        return nomPlan;
    }

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    public ArrayList<Materia> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Materia> materia) {
        this.materia = materia;
    }
    
    public void agregar_materia(Materia materia){
        this.materia.add(materia);
    }
    
}

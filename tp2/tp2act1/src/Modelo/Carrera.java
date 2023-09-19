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
public class Carrera {
    
    private Integer idCarrera;
    private String nomCarrera;
    private ArrayList<Plan> plan = new ArrayList<Plan>();

    public Carrera(Integer idCarrera, String nomCarrera) {
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public ArrayList<Plan> getPlan() {
        return plan;
    }

    public void setPlan(ArrayList<Plan> plan) {
        this.plan = plan;
    }
    
       public void agregar_plan(Plan p){
           this.plan.add(p);
}
}


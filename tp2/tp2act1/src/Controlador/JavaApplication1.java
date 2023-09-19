/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;
import Modelo.*;

/**
 *
 * @author nicol
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera ingenieriaEnInformatica = new Carrera(1,"Ingenieria en Informatica");
        Carrera arquitectura = new Carrera(2,"Arquitectura");
        Plan uno = new Plan(1,"Plan Ing uno",2010);
        Plan dos = new Plan(2,"Plan Ing dos",2015);
        Plan tres = new Plan(3,"Plan Ing tres",2023);
        ingenieriaEnInformatica.agregar_plan(uno);
        ingenieriaEnInformatica.agregar_plan(dos);
        ingenieriaEnInformatica.agregar_plan(tres);
        Plan cuatro = new Plan(4,"Plan  Arq cuatro",2011);
        arquitectura.agregar_plan(cuatro);
        
        Materia programacion1 = new Materia(1,"Programacion 1",1);        
        Materia programacion2 = new Materia(2,"Programacion 2",2);
        
        uno.agregar_materia(programacion1);
        uno.agregar_materia(programacion2);
        dos.agregar_materia(programacion1);
        dos.agregar_materia(programacion2);
        tres.agregar_materia(programacion1);
        tres.agregar_materia(programacion2);
        
        Materia dibujito1 = new Materia(3,"Dibujito1",1);
        Materia dibujito2 = new Materia(4,"Dibujito2",2); 
        
        cuatro.agregar_materia(dibujito1);
        cuatro.agregar_materia(dibujito2);
        
        
        for(Plan p:ingenieriaEnInformatica.getPlan()){
            for(Materia m:p.getMateria()){
                System.out.println(m.getIdMat() + ", " + m.getNomMat() + ", " + m.getAnioCursado());
            }
        }
    }
    }

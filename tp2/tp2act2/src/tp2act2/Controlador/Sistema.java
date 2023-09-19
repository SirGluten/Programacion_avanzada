/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2act2.Controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import tp2act2.Modelo.*;
import tp2act2.Vista.Ventana_principal;
import tp2act2.Vista.*;

/**
 *
 * @author nicol
 */
public class Sistema {

    public ArrayList<Area> areas = new ArrayList<>();
    ArrayList<Documento> documentos = new ArrayList<>();
    ArrayList<Movimiento> movimientos = new ArrayList<>();

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    //VISTAS-------------------------------------------------------------------
    public void opnMenu() {
        new Ventana_principal().setVisible(true);
    }

    public void opnEj1() {
        new ej1().setVisible(true);
    }

    public void opnEj2() {
        new ej2().setVisible(true);
    }

    //EJERCICIO 1-------------------------------------------------------------------
    public String ejercicio1(int d, int m, int a) {

        Area area1 = new Area("area1", "1111");
        Area area2 = new Area("area2", "1112");
        ArrayList<Area> areas = new ArrayList<>();
        areas.add(area1);
        areas.add(area2);
        Date f1 = new Date(2011, 4, 5);
        Date f2 = new Date(2012, 4, 5);
        //EXPEDIENTES
        Expediente exp1 = new Expediente("a", "a", f1);
        Expediente exp2 = new Expediente("a", "a", f2);
        //CORRESPONDENCIA
        Correspondencia cor1 = new Correspondencia("Juan", "Su casa", f1);
        Correspondencia cor2 = new Correspondencia("Micaela", "Su casa2", f2);
        Correspondencia cor3 = new Correspondencia("Tito", "Su casa3", f1);
        //NOTA  public Nota(Integer nro, Integer año, String asunto, Date fechacreacion)
        Nota not1 = new Nota("nota 1", f1);
        Nota not2 = new Nota("nota 2", f2);

        area1.addDocumento(exp1);
        area1.addDocumento(exp2);
        area1.addDocumento(cor1);
        area1.addDocumento(cor2);
        area2.addDocumento(cor3);
        area1.addDocumento(not1);
        area2.addDocumento(not2);

        //Date fecha = definirFecha(d, m, a);

        return buscarXfechaV(f1, areas);

    }

    //METODOS
    //EJERCICIO 1
    public void buscarXfecha(Date f, ArrayList<Area> arr) {
        for (Area a : arr) {
            for (Documento d : a.getListaDocumentos()) {
                if (d.getFechacreacion() == f) {
                    d.imprimir();
                    System.out.println();
                }
            }
        }
    }

    public String buscarXfechaV(Date f, ArrayList<Area> arr) {
        String txt = "";
        for (Area a : arr) {
            for (Documento d : a.getListaDocumentos()) {
                if (d.getFechacreacion() == f) {
                    txt = txt + d.imprimirV();
                    System.out.println(txt);
                }
            }
        }
        return txt;
    }

    public static Date definirFecha() { //Version de consolas
        Scanner s = new Scanner(System.in);
        Date f = new Date();
        System.out.println("BUSCANDO DOCUMENTOS, INTRODUZCA LA INFORMACION NECESARIA");
        try {
            System.out.println("Año:");
            f.setYear(s.nextInt());
            System.out.println("Mes:");
            f.setMonth(s.nextInt());
            System.out.println("Dia:");
            f.setDate(s.nextInt());
        } catch (Exception e) {
            System.out.println(e);
        }
        return f;
    }

    public Date definirFecha(int d, int m, int a) {

        Date f = new Date();
        //System.out.println("BUSCANDO DOCUMENTOS, INTRODUZCA LA INFORMACION NECESARIA");
        try {
            f.setYear(a);
            f.setMonth(m);
            f.setDate(d);
        } catch (Exception e) {
            System.out.println(e);
        }
        return f;
    }
    //EJERCICIO2 

    //EJERCICIO 2-------------------------------------------------------------------
    public void crear_area(String nomarea, String telefono) {
        Area new_area = new Area(nomarea, telefono);
        this.areas.add(new_area);
    }

    public void crear_area(Area new_area) {
        this.areas.add(new_area);
    }

    public void crear_correspondencia(Integer idArea, String remitente, String direccion, Date fechacreacion) { //crea y agrega una correspondencia al array general de documentos y a su respectiva area
        Correspondencia c = new Correspondencia(remitente, direccion, fechacreacion);
        c.add_mov();
        this.documentos.add(c);
        addDocumento(idArea, c);
    }

    public void crear_expediente(Integer idArea, String letra, String anexo, Date fechacreacion) { //crea y agrega un expediente al array general de documentos y a su respectiva area
        Expediente e = new Expediente(letra, anexo, fechacreacion);
        e.add_mov();
        this.documentos.add(e);
        addDocumento(idArea, e);
    }

    public void crear_nota(Integer idArea, String asunto, Date fechacreacion) { //crea y agrega una nota al array general de documentos y a su respectiva area
        Nota n = new Nota(asunto, fechacreacion);
        n.add_mov();
        this.documentos.add(n);
        addDocumento(idArea, n);

    }

    private void addDocumento(Integer idArea, Documento d) { //agrega un documento al array de documentos de una determinada area
        for (Area a : areas) {
            if (Objects.equals(a.getId(), idArea)) {
                a.addDocumento(d);
            }
        }
    }

    public Integer buscar_documento(Integer docId) {
        Integer r = null;
        for (Area a : areas) {
            for (Documento d : a.getListaDocumentos()) {
                if (Objects.equals(d.getIdDocumento(), docId)) {
                    r = a.getId();
                }
            }
        }
        return r;
    }

    public ArrayList cargar_areas() {
        ArrayList l = new ArrayList();
        for (Area a : areas) {
            l.add(
                    a.getNomarea());
        }
        return l;
    }

    public Integer buscar_area_x_nombre(String s) {
        Integer i = null;
        for (Area a : getAreas()) {
            if (a.getNomarea().equals(s)) {
                i = a.getId();
            }
        }
        return i;
    }

    public ArrayList buscar_Documentos_de_area(Integer i) {
        ArrayList<Documento> b = null;
        for (Area a : getAreas()) {
            if (a.getId().equals(i)) {
                b = a.getListaDocumentos();
            }
        }
        return b;
    }
    

}

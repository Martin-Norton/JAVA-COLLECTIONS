/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Martin Norton
 */
public class AlumnosEntidades {
    private String nombre;
    private ArrayList <Integer> notas = new ArrayList() ; 

    public AlumnosEntidades() {
    }

    public AlumnosEntidades(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = getNotas();
    }

    @Override
    public String toString() {
        return "AlumnosEntidades{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    

    
    
    
}

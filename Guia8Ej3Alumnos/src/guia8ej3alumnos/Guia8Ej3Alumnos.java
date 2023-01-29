/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3alumnos;

import Alumnos.Servicio.AlumnosServicio;

/**
 *
 * @author Martin Norton
 */
public class Guia8Ej3Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnosServicio as = new AlumnosServicio();
        as.agregarAlumno();
        as.mostrarCurso();
        as.notaFinal();
   
    }
    
}

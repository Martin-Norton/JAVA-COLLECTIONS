/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos.Servicio;

import Alumnos.Entidades.AlumnosEntidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class AlumnosServicio {

    Scanner leer = new Scanner(System.in);
    List<AlumnosEntidades> alumnos = new ArrayList();

    public AlumnosEntidades crearAlumno() {
        
        AlumnosEntidades objeto = new AlumnosEntidades();
        
        System.out.println("ingrese el nombre del alumno");
        objeto.setNombre(leer.next());
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese la nota " + (i + 1));
            objeto.getNotas().add(leer.nextInt());
        }

        return objeto;
    }

    public void agregarAlumno() {
        int opc = 1;
        do {
            alumnos.add(crearAlumno());
            System.out.println("desea cargar otro alumno?");
            System.out.println("1) SI");
            System.out.println("2) NO");
            opc = leer.nextInt();
        } while (opc != 2);

    }

    public void mostrarCurso() {
        
        for (AlumnosEntidades aux : alumnos) {
            System.out.println(aux);
        }
    }
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno del que quiere calcular su nota final");
        String al = leer.next();
        Integer notas = 0;
        
        for (AlumnosEntidades aux : alumnos) {
            if (aux.getNombre().equals(al)) {
                for (int i = 0; i < 3; i++) {
                    notas += aux.getNotas().get(i);
                }
            }  
        }
        Integer notaFinal = notas /3;
        System.out.println("la nota final de " +al + " es " + notaFinal);
    }

}

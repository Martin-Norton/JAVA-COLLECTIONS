/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Servicio;

import Cine.Entidades.CineEntidades;
import Cine.Utilidades.CineUtilidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class CineServicio {

    Scanner leer = new Scanner(System.in);
    List<CineEntidades> peliculas = new ArrayList();

    public CineEntidades crearPelicula() {
        CineEntidades pelicula = new CineEntidades();

        System.out.println("ingrese el titulo de la pelicula");
        pelicula.setTitulo(leer.next());
        System.out.println("ingrese el nombre del director");
        pelicula.setDirector(leer.next());
        System.out.println("ingrese la duracion de la pelicula");
        pelicula.setDuracion(leer.nextInt());

        return pelicula;
    }

    public void agregarPelicula() {
        int opc = 1;
        do {
            peliculas.add(crearPelicula());
            System.out.println("desea agregar otra pelicula?");
            System.out.println("1) si");
            System.out.println("2) no");
            opc = leer.nextInt();
        } while (opc != 2);
    }

    public void mostrarPeliculas() {
        for (CineEntidades aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void mayor1Hora() {
        System.out.println("de duracion de mayor a 1 hora");
        for (CineEntidades aux : peliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }
    }

    public void mayorAMenor() {
        System.out.println("de mayor a menor duracion");
        Collections.sort(peliculas, CineUtilidades.ordenMayor);
        mostrarPeliculas();
    }

    public void menorAMayor() {
        System.out.println("de menor a mayor duracion");
        Collections.sort(peliculas, CineUtilidades.ordenMenor);
        mostrarPeliculas();
    }

    public void ordenTitulo() {
        System.out.println("orden alfabetico por titulo");
        Collections.sort(peliculas, CineUtilidades.ordenTitulo);
        mostrarPeliculas();
    }
    public void ordenDirector(){
        System.out.println("orden alfabetico por director");
        Collections.sort(peliculas, CineUtilidades.ordenDirector);
        mostrarPeliculas();
    }
    public void menuOrdenes(){
        int opc = 0;
        do {
            System.out.println("que desea ver?");
        System.out.println("1) mayores a 1 hora de duracion");
        System.out.println("2) orden mayor a menor");
        System.out.println("3) orden menor a mayor");
        System.out.println("4) orden por titulo");
        System.out.println("5) orden por director");
        System.out.println("6) salir");
        opc = leer.nextInt();
                
        switch (opc) {
            case 1:
                mayor1Hora();
                break;
            case 2:
                mayorAMenor();
                break;
            case 3:
                menorAMayor();
                break;
            case 4:
                ordenTitulo();
                break;
            case 5:
                mayorAMenor();
                break;
            case 6:
                System.out.println("usted ha salido");
                break;
            default:
                System.out.println("opcion no valida");
        }
        } while (opc!=6);   
        System.out.println("hasta la proxima!");
    }

}

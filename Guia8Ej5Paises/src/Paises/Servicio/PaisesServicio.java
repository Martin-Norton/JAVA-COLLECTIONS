/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises.Servicio;

import Paises.Entidades.PaisesEntidades;
import Paises.Utilidades.PaisesUtilidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class PaisesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<PaisesEntidades> countries = new HashSet();

    public PaisesEntidades crearPais() {
        PaisesEntidades pe = new PaisesEntidades();
        System.out.println("ingrese el nombre del pais");
        pe.setPais(leer.next());

        return pe;
    }

    public void agregarPais() {
        int opc = 0;
        do {
            countries.add(crearPais());
            System.out.println("1) seguir ingresando paises");
            System.out.println("2) salir");
            opc = leer.nextInt();
        } while (opc != 2);
    }
    public void mostrarPaises(){
        for (PaisesEntidades aux : countries) {
            System.out.println(aux.getPais());
        }
    
    }
    
    public void mostrarOrdenado(){
        ArrayList<PaisesEntidades> paisesLista= new ArrayList(countries);
        Collections.sort(paisesLista, PaisesUtilidades.ordenAlfa);
        for (PaisesEntidades aux : paisesLista) {
            System.out.println(aux.getPais());
        }
    }
    public void eliminarPais(){
        int cont = 0;
        Iterator<PaisesEntidades> it = countries.iterator();
        System.out.println("que pais desea eliminar?");
        String elim = leer.next();
        while (it.hasNext()) {
            PaisesEntidades aux = it.next();
            if (aux.getPais().equals(elim)) {
                cont += 1;
                it.remove();
                mostrarPaises();
                
            }
        }
        if (cont==0) {
             System.out.println("el pais no se encuentra en el conjunto! :(");    
        }
    }
    

}

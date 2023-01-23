/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Servicio;

import Razas.Entidades.RazasEntidades;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class RazasServicio {

    Scanner leer = new Scanner(System.in);

    private List<RazasEntidades> razasPerros;

    public RazasServicio() {
        this.razasPerros = new ArrayList();
    }

    private void ingresarRazas() {
        RazasEntidades raza = new RazasEntidades();
        System.out.println("ingrese la raza deseada ");
        raza.setRaza(leer.next());
        agregarRaza(raza);
    }

    private void agregarRaza(RazasEntidades r) {

        razasPerros.add(r);

    }

    public void eliminarRaza() {
       
        Iterator <RazasEntidades> it = razasPerros.iterator();

        System.out.println("ingrese la raza que quiere eliminar");
        String razaAEliminar = leer.next();
        int opc = 0;

        while (it.hasNext()) {
            RazasEntidades aux = it.next();
            
           
            if (aux.getRaza().equals(razaAEliminar)) {
                it.remove();
                opc +=1;
                mostrarArrayList();
            }
        }
        if (opc==0) {
            System.out.println("no se encontro la raza master");
            mostrarArrayList();
        }

    }

    public void mostrarArrayList() {
        for (RazasEntidades aux : razasPerros) {
            System.out.println(aux);
        }

    }

    public void menu() {
        int opc = 1;
        do {
            ingresarRazas();
            System.out.println("desea ingresar otra raza?");
            System.out.println("1) SI");
            System.out.println("2) NO");
            opc = leer.nextInt();
        } while (opc == 1);
        System.out.println("las razas de perros son " + razasPerros.size());
        mostrarArrayList();
    }
}

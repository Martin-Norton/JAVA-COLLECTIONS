/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej4cine;

import Cine.Servicio.CineServicio;

/**
 *
 * @author Martin Norton
 */
public class Guia8Ej4Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        cs.agregarPelicula();
        cs.mostrarPeliculas();
        cs.menuOrdenes();
    }
    
}

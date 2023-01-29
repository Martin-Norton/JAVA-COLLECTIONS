/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej5paises;

import Paises.Servicio.PaisesServicio;

/**
 *
 * @author Martin Norton
 */
public class Guia8Ej5Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PaisesServicio ps = new PaisesServicio();
      ps.agregarPais();
      ps.mostrarPaises();
      ps.mostrarOrdenado();
      ps.eliminarPais();
              
      
    }
    
}

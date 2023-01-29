/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Servicio;

import Tienda.Entidades.TiendaEntidades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Martin Norton Se necesita una aplicación para una tienda en la cual
 * queremos almacenar los distintos productos que venderemos y el precio que
 * tendrán. Además, se necesita que la aplicación cuente con las funciones
 * básicas. Estas las realizaremos en el servicio. Como, introducir un elemento,
 * modificar su precio, eliminar un producto y mostrar los productos que tenemos
 * con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del
 * producto y de valor el precio. Realizar un menú para lograr todas las
 * acciones previamente mencionadas.
 */
public class TiendaServicio {

    Scanner leer = new Scanner(System.in);
    TiendaEntidades prod = new TiendaEntidades();
    HashMap<String, Integer> productos = new HashMap();

    public void crearProducto() {
        int opc = 0;
        do {
            System.out.println("ingrese el nombre del producto");
            prod.setNombre(leer.next());
            System.out.println("ingrese el precio del producto");
            prod.setPrecio(leer.nextInt());
            productos.put(prod.getNombre(), prod.getPrecio());
            System.out.println("desea agregar otro producto? 1 si , 2 no");
            opc= leer.nextInt();

        } while (opc!=2);
    }

    public void modificarPrecio() {
        System.out.println("que producto desea modificar?");
        String mod = leer.next();
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            if (key.equals(mod)) {
                System.out.println("ingrese el nuevo precio");
                entry.setValue(leer.nextInt());
            }
        }
    }

    public void eliminarProducto() {
        System.out.println("que producto desea eliminar?");
        String elim = leer.next();
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            if (key.equals(elim)) {
                productos.remove(entry.getKey());
            }

        }
    }

    public void mostrarMapa() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(entry.getKey() + entry.getValue());

        }
    }

    public void menu() {
        int opc = 0;
        do {
            System.out.println("que accion desea realizar?");
            System.out.println("1) crear un producto");
            System.out.println("2) modificar un precio ");
            System.out.println("3) eliminar un producto");
            System.out.println("4) mostrar todos los productos");
            System.out.println("5) salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarMapa();
                    break;
                default:
                    System.out.println("opcion no valida");
            }

        } while (opc != 5);
    }

}

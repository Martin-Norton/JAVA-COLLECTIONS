/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises.Utilidades;

import Paises.Entidades.PaisesEntidades;
import java.util.Comparator;

/**
 *
 * @author Martin Norton
 */
public class PaisesUtilidades {
    public static Comparator<PaisesEntidades> ordenAlfa = new Comparator<PaisesEntidades>() {
        @Override
        public int compare(PaisesEntidades t, PaisesEntidades t1) {
           return t.getPais().compareTo(t1.getPais());
        }
    };
            
    
}

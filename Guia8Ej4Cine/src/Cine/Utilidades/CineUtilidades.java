/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Utilidades;

import Cine.Entidades.CineEntidades;
import java.util.Comparator;

/**
 *
 * @author Martin Norton
 */
public class CineUtilidades {
    public static Comparator <CineEntidades> ordenMayor = new Comparator<CineEntidades>() {
        @Override
        public int compare(CineEntidades t, CineEntidades t1) {
          return t.getDuracion().compareTo(t1.getDuracion());
        } 
    };
    public static Comparator <CineEntidades> ordenMenor = new Comparator<CineEntidades>() {
        @Override
        public int compare(CineEntidades t, CineEntidades t1) {
          return t1.getDuracion().compareTo(t.getDuracion());
        } 
    };
    public static Comparator <CineEntidades> ordenTitulo = new Comparator<CineEntidades>() {
        @Override
        public int compare(CineEntidades t, CineEntidades t1) {
          return t.getTitulo().compareTo(t1.getTitulo());
        } 
    };
    public static Comparator <CineEntidades> ordenDirector = new Comparator<CineEntidades>() {
        @Override
        public int compare(CineEntidades t, CineEntidades t1) {
          return t.getDirector().compareTo(t1.getDirector());
        } 
    };
    
}

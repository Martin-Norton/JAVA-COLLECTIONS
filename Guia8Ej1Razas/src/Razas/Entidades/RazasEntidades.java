/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Entidades;

/**
 *
 * @author Martin Norton
 */
public class RazasEntidades {
    private String raza;

    public RazasEntidades() {
    }

    public RazasEntidades(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazasEntidades{" + "raza=" + raza + '}';
    }
    
    
}


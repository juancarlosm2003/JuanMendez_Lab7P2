/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_lab7p2;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos Mendez
 */
public class Artistas {

    String n_artistico;
    ArrayList<Canciones> canciones;

    public Artistas() {
    }

    public Artistas(String n_artistico, ArrayList<Canciones> canciones) {
        this.n_artistico = n_artistico;
        this.canciones = canciones;
    }

    public String getN_artistico() {
        return n_artistico;
    }

    public void setN_artistico(String n_artistico) {
        this.n_artistico = n_artistico;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Artistas{" + "n_artistico=" + n_artistico + ", canciones=" + canciones + '}';
    }

}

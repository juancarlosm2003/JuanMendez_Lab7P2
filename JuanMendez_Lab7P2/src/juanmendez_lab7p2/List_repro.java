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
public class List_repro {

    String nombre;
    int likes;

    public List_repro() {
    }

    public List_repro(String nombre, int likes) {
        this.nombre = nombre;
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }


    @Override
    public String toString() {
        return "List_repro{" + "nombre=" + nombre + ", likes=" + likes + ", cancion=" + '}';
    }

}

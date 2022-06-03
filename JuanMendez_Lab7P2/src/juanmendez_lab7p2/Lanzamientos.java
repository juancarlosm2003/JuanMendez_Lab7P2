/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_lab7p2;

/**
 *
 * @author Juan Carlos Mendez
 */
public class Lanzamientos {

    String titulo, fecha;
    int conteolikes;

    public Lanzamientos() {
    }

    public Lanzamientos(String titulo, String fecha, int conteolikes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.conteolikes = conteolikes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getConteolikes() {
        return conteolikes;
    }

    public void setConteolikes(int conteolikes) {
        this.conteolikes = conteolikes;
    }

    @Override
    public String toString() {
        return "Lanzamientos{" + "titulo=" + titulo + ", fecha=" + fecha + ", conteolikes=" + conteolikes + '}';
    }

}

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
public class Usuarios {

    int edad;
    String usuario, contraseña;

    public Usuarios() {
    }

    public Usuarios(int edad, String usuario, String contraseña) {
        this.edad = edad;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "edad=" + edad + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}

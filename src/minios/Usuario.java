/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.io.Serializable;

/**
 *
 * @author Alejandro
 */
public abstract class Usuario implements Serializable {

    protected String nombre;
    protected String contrasena;
    protected Configuracion config;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.config = new Configuracion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Configuracion getConfig() {
        return config;
    }

    public void setConfig(Configuracion config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", contrasena=" + contrasena + ", config=" + config + '}';
    }

}

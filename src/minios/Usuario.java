/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

/**
 *
 * @author Alejandro
 */
public abstract class Usuario {

    protected String nombre;
    protected String contrasena;
    protected Configuracion config;

    public Usuario(String nombre, String contrasena, Configuracion config) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.config = config;
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

}

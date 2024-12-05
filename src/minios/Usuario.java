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

    protected String username;
    protected String contrasena;
    protected Configuracion config;

    public Usuario(String username, String contrasena) {
        this.username = username;
        this.contrasena = contrasena;
        this.config = new Configuracion();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return "Usuario{" + "nombre=" + username + ", contrasena=" + contrasena + ", config=" + config + '}';
    }

}

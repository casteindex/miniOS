/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Administrador extends Usuario {

    ArrayList<Usuario> usuarios;

    public Administrador(String nombre, String contrasena, Configuracion config) {
        super(nombre, contrasena, config);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}

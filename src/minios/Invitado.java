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
public class Invitado extends Usuario implements Serializable {

    public Invitado(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.awt.Font;
import java.io.Serializable;

/**
 *
 * @author Alejandro
 */
public class Configuracion implements Serializable {

    private Font fuenteEscritorio;
    private Font fuenteEditor;

    public Configuracion() {
        this.fuenteEscritorio = new Font("Papyrus", Font.PLAIN, 12);
        this.fuenteEditor = new Font("Comic Sans MS", Font.PLAIN, 12);
    }

    public Configuracion(Font fuenteEscritorio, Font fuenteEditor) {
        this.fuenteEscritorio = fuenteEscritorio;
        this.fuenteEditor = fuenteEditor;
    }

    public Font getFuenteEscritorio() {
        return fuenteEscritorio;
    }

    public void setFuenteEscritorio(Font fuenteEscritorio) {
        this.fuenteEscritorio = fuenteEscritorio;
    }

    public Font getFuenteEditor() {
        return fuenteEditor;
    }

    public void setFuenteEditor(Font fuenteEditor) {
        this.fuenteEditor = fuenteEditor;
    }

    @Override
    public String toString() {
        return "Configuracion{" + "fuenteEscritorio=" + fuenteEscritorio + ", fuenteEditor=" + fuenteEditor + '}';
    }

}

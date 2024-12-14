/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.awt.Font;
import java.io.Serializable;
import javax.swing.UIManager;

/**
 *
 * @author Alejandro
 */
public class Configuracion implements Serializable {

    private Font fuenteEscritorio;
    private Font fuenteEditor;
    public static final Font DEFAULT_DESKTOP_FONT = new Font("Segoe UI", Font.PLAIN, 14);
    public static final Font DEFAULT_EDITOR_FONT = new Font("Consolas", Font.PLAIN, 14);

    public Configuracion() {
        this.fuenteEscritorio = DEFAULT_EDITOR_FONT;
        this.fuenteEditor = DEFAULT_EDITOR_FONT;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Alejandro
 */
public class Configuracion implements Serializable {

    public static final Font DEFAULT_DESKTOP_FONT = new Font("Segoe UI", Font.PLAIN, 12);
    public static final Font DEFAULT_EDITOR_FONT = new Font("Consolas", Font.PLAIN, 14);
    public static final Color DEFAULT_FONT_COLOR = Color.BLACK;
    public static final Color DEFAULT_BAR_COLOR = Color.WHITE;
    public static final String DEFAULT_WALLPAPER_PATH = "./src/icons/wallpaper.jpg";

    private Font fuenteEscritorio;
    private Font fuenteEditor;
    private Color desktopFontColor;
    private Color editorFontColor;
    private Color menuBarColor;
    private String wallpaperPath;

    public Configuracion() {
        this.fuenteEscritorio = DEFAULT_DESKTOP_FONT;
        this.fuenteEditor = DEFAULT_EDITOR_FONT;
        this.desktopFontColor = DEFAULT_FONT_COLOR;
        this.editorFontColor = DEFAULT_FONT_COLOR;
        this.menuBarColor = DEFAULT_BAR_COLOR;
        this.wallpaperPath = DEFAULT_WALLPAPER_PATH;
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

    public Color getDesktopFontColor() {
        return desktopFontColor;
    }

    public void setDesktopFontColor(Color desktopFontColor) {
        this.desktopFontColor = desktopFontColor;
    }

    public Color getEditorFontColor() {
        return editorFontColor;
    }

    public void setEditorFontColor(Color editorFontColor) {
        this.editorFontColor = editorFontColor;
    }

    public Color getMenuBarColor() {
        return menuBarColor;
    }

    public void setMenuBarColor(Color menuBarColor) {
        this.menuBarColor = menuBarColor;
    }

    public String getWallpaperPath() {
        return wallpaperPath;
    }

    public void setWallpaperPath(String wallpaperPath) {
        this.wallpaperPath = wallpaperPath;
    }

    @Override
    public String toString() {
        return "Configuracion{" + "fuenteEscritorio=" + fuenteEscritorio + ", fuenteEditor=" + fuenteEditor + ", desktopFontColor=" + desktopFontColor + ", editorFontColor=" + editorFontColor + ", menuBarColor=" + menuBarColor + '}';
    }

}

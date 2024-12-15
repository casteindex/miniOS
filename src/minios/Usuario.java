/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.io.Serializable;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Alejandro
 */
public class Usuario implements Serializable {

    protected String nombre;
    protected String contrasena;
    protected Configuracion config;
    protected DefaultMutableTreeNode raiz;
    protected boolean admin;

    public Usuario(String nombre, String contrasena, boolean admin) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.admin = admin;
        this.config = new Configuracion();
        this.raiz = new DefaultMutableTreeNode("Documentos");
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

    public DefaultMutableTreeNode getRaiz() {
        return raiz;
    }

    public void setRaiz(DefaultMutableTreeNode raiz) {
        this.raiz = raiz;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", contrasena=" + contrasena + ", config=" + config + ", raiz=" + raiz + ", admin=" + admin + '}';
    }

    public String[] getInfoList() {
        return new String[]{
            "nombre: " + nombre,
            "cargando_-_tipo_-_de_-_usuario_-_...",
            "el_-_usuario_-_es_-_administrador?_-_" + isAdmin(),
            "cargando_-_sistema_-_de_-_archivos:_-_1/2",
            "cargando_-_sistema_-_de_-_archivos:_-_2/2",
            "cargando_-_sistema_-_de_-_archivos:_-_" + raiz,
            "cargando_-_configuración_-_...",
            "obteniendo_-_desktop_-_font:_-_" + config.getFuenteEscritorio(),
            "obteniendo_-_editor_-_font" + config.getFuenteEditor(),
            "obteniendo_-_desktop_-_font_-_color:_-_" + config.getDesktopFontColor(),
            "obteniendo_-_editor_-_font_-_color:_-_" + config.getEditorFontColor(),
            "onteniendo_-_menu_-_bar_-_color:_-_" + config.getMenuBarColor(),
            "proceso_-_proceso_-_completo_-_..."
        };
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package minios;

/**
 *
 * @author Alejandro
 */
public enum Mensajes {

    NOMBRE_USUARIO_VACIO("Por favor, ingrese un nombre de usuario."),
    ACERCA_DEL_EDITOR("Este editor de texto ha sido desarrollado por Alejandro Castellanos como parte de un proyecto educativo.\n\nOfrece funcionalidades básicas para abrir, editar y guardar archivos, además de una interfaz sencilla y eficiente.\n\n¡Gracias por usarlo!"),
    BIENVENIDA_PRIMER_USUARIO("¡Bienvenido!\n\nSu usuario ha sido creado con éxito.\n¡Gracias por unirse a nuestra plataforma!"),
    ERROR_INICIO_DE_SESIÓN("No se pudo iniciar sesión.\nEl nombre de usuario o la contraseña ingresados no son correctos."),
    CAMBIOS_SIN_GUARDAR("Tiene cambios sin guardar. ¿Desea guardar antes de salir?"),
    NOMBRE_USUARIO_VACIO2("El usuario debe tener un nombre."),
    USUARIO_EXISTENTE("El nombre de usuario ya ha sido utilizado."),
    USUARIO_CREADO("El usuario se ha creado con éxito."),
    SIN_PERMISO_DE_EDICIÓN("No tiene permisos para editar este usuario."),
    NOMBRE_USUARIO_VACIO3("No puede dejar el campo del nombre del usuario en blanco.\nPor favor, ingrese un nombre de usuario."),
    USUARIO_ACTUALIZADO("El usuario se ha actualizado correctamente."),
    CONFIRMAR_ELIMINAR_USUARIO("Esta acción eliminará a un usuario. ¿Desea continuar?"),
    USUARIO_ELIMINADO("El usuario ha sido eliminado con éxito."),
    FUENTE_MODIFICADA("La fuente se ha modificado exitosamente."),
    COLOR_DE_FUENTE("Seleccione el color de la letra."),
    COLOR_DE_BARRAS_DE_MENÚ("Seleccione el color de las barras de menú."),
    ERROR_GENÉRICO("Ocurrió un error."),
    ARCHIVO_NO_ENCONTRADO("El archivo no se encontró."),
    ARCHIVO_GUARDADO("El archivo se ha guardado con éxito."),
    ERROR_AL_LEER_ARCHIVO("Error al leer el archivo."),
    ERROR_AL_ESCRIBIR_ARCHIVO("Algo salió mal. Error al escribir el archivo.");

    private final String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}

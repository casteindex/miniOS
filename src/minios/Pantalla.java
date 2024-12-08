/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Alejandro
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();

        /* Cargar el archivo binario que contiene toda la información del
        sistema: la lista de todos los usuarios y su información */
        this.usuarios = loadUserFile();
        System.out.println(usuarios);

        /*
        // Ingreso manual de usuarios (BORRAR DESPUÉS):
        this.usuarios = new ArrayList();
        usuarios.add(new Administrador(usuarios, "admin", "admin"));
        usuarios.add(new Administrador(usuarios, "alejandro", "admin"));
        usuarios.add(new Invitado("guest", "temp"));
        usuarios.add(new Invitado("guest2", "temp"));
        saveUserFile();
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_editor = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_editor = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmi_abrirArchivo = new javax.swing.JMenuItem();
        jmi_guardarArchivo = new javax.swing.JMenuItem();
        jmi_guardarArchivoComo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmi_fuenteEditor = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmi_informacionEditor = new javax.swing.JMenuItem();
        jd_explorador = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_explorador = new javax.swing.JTree();
        jd_escritorio = new javax.swing.JDialog();
        btn_abrirExplorador = new javax.swing.JButton();
        btn_abrirEditor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        txt_loginConstrasena = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_loginUsuario = new javax.swing.JTextField();

        jd_editor.setTitle("Editor de Texto");
        jd_editor.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jd_editorWindowClosing(evt);
            }
        });

        txt_editor.setColumns(20);
        txt_editor.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txt_editor.setRows(5);
        jScrollPane1.setViewportView(txt_editor);

        jMenu3.setText("Archivo");

        jmi_abrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_abrirArchivo.setText("Abrir...");
        jmi_abrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_abrirArchivoActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_abrirArchivo);

        jmi_guardarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_guardarArchivo.setText("Guardar");
        jmi_guardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarArchivoActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_guardarArchivo);

        jmi_guardarArchivoComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_guardarArchivoComo.setText("Guardar como...");
        jmi_guardarArchivoComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarArchivoComoActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_guardarArchivoComo);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Formato");

        jmi_fuenteEditor.setText("Fuente...");
        jMenu4.add(jmi_fuenteEditor);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Ayuda");

        jmi_informacionEditor.setText("Aceca del Editor");
        jmi_informacionEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_informacionEditorActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_informacionEditor);

        jMenuBar2.add(jMenu5);

        jd_editor.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jd_editorLayout = new javax.swing.GroupLayout(jd_editor.getContentPane());
        jd_editor.getContentPane().setLayout(jd_editorLayout);
        jd_editorLayout.setHorizontalGroup(
            jd_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        jd_editorLayout.setVerticalGroup(
            jd_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        jd_explorador.setTitle("Explorador de Archivos");

        jScrollPane2.setViewportView(jt_explorador);

        javax.swing.GroupLayout jd_exploradorLayout = new javax.swing.GroupLayout(jd_explorador.getContentPane());
        jd_explorador.getContentPane().setLayout(jd_exploradorLayout);
        jd_exploradorLayout.setHorizontalGroup(
            jd_exploradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        jd_exploradorLayout.setVerticalGroup(
            jd_exploradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        btn_abrirExplorador.setText("explorador");
        btn_abrirExplorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirExploradorActionPerformed(evt);
            }
        });

        btn_abrirEditor.setText("editor");
        btn_abrirEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirEditorActionPerformed(evt);
            }
        });

        jMenu1.setText("Inicio");

        jMenuItem2.setText("Cerrar sesión");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Agregar usuario...");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Configuración...");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem5.setText("Información del Sistema...");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jd_escritorio.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_escritorioLayout = new javax.swing.GroupLayout(jd_escritorio.getContentPane());
        jd_escritorio.getContentPane().setLayout(jd_escritorioLayout);
        jd_escritorioLayout.setHorizontalGroup(
            jd_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escritorioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_abrirExplorador)
                    .addComponent(btn_abrirEditor))
                .addContainerGap(640, Short.MAX_VALUE))
        );
        jd_escritorioLayout.setVerticalGroup(
            jd_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escritorioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btn_abrirExplorador)
                .addGap(39, 39, 39)
                .addComponent(btn_abrirEditor)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_login.setText("Iniciar Sesión");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel1.setText("Bienvenido");

        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_login)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_loginUsuario)
                                .addComponent(txt_loginConstrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_loginConstrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_login)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        /* Iniciar sesión significa cargar la configuración del sistema.
        Nota: Si el ArrayList de usuarios está vacío, significa que es la primera
        vez que se inicia sesión -> Crear usuario Administrador con las credenciales
        que introdujo el usuario */
        if (usuarios.isEmpty()) { // No hay usuarios registrados. Crear usuario
            createFirstUser();
        } else {
            this.activeUser = getActiveUser(txt_loginUsuario.getText(), txt_loginConstrasena.getText());
            if (activeUser == null) { // Credenciales incorrectas. No hay inicio de sesión
                JOptionPane.showMessageDialog(this, "No se pudo iniciar sesión.\n"
                        + "El nombre de usuario o la contraseña que ingresaste"
                        + " no son correctos.", "Error de Inicio de Sesión",
                        JOptionPane.ERROR_MESSAGE
                );
                return; // Salir del método
            } else { // Usuario encontrado
                JOptionPane.showMessageDialog(this,
                        "¡Hola de nuevo, " + activeUser.getNombre() + "!\n"
                        + "Nos alegra verte de vuelta. ¡Que tengas un gran día!",
                        "Bienvenido", JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
        loadDesktop(activeUser); // Cargar escritorio del usuario
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_abrirEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirEditorActionPerformed
        // Si ya hay una instancia del editor abierta, mostrarla
        if (jd_editor.isVisible()) {
            jd_editor.toFront();
        } else {
            jd_editor.pack();
            jd_editor.setLocationRelativeTo(this);
            jd_editor.setVisible(true);
            txt_editor.setText("");
            this.currentTextFile = null;
            this.contenidoGuardado = "";
        }
    }//GEN-LAST:event_btn_abrirEditorActionPerformed

    private void jmi_abrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_abrirArchivoActionPerformed
        this.currentTextFile = selectFile();
        if (currentTextFile != null) {
            String fileContent = getFileText(currentTextFile);
            txt_editor.setText(fileContent);
            this.contenidoGuardado = fileContent;
        }
    }//GEN-LAST:event_jmi_abrirArchivoActionPerformed

    private void jmi_guardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarArchivoActionPerformed
        saveFile(currentTextFile, txt_editor.getText());
    }//GEN-LAST:event_jmi_guardarArchivoActionPerformed

    private void jmi_guardarArchivoComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarArchivoComoActionPerformed
        saveFileAs(txt_editor.getText());
    }//GEN-LAST:event_jmi_guardarArchivoComoActionPerformed

    private void jmi_informacionEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_informacionEditorActionPerformed
        JOptionPane.showMessageDialog(jd_editor,
                TEXT_EDITOR_ABOUT, "Acerca del Editor", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmi_informacionEditorActionPerformed

    private void jd_editorWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_editorWindowClosing
        /* Hacerle saber al usuario si el docuemento no ha sido guardado. Esto
        se da en dos casos:
        1. Si nunca hubo un archivo abierto
        2. El archivo abierto se editó pero no se guardó */
        int opcion = JOptionPane.DEFAULT_OPTION;
        if (!txt_editor.getText().equals(contenidoGuardado)) {
            opcion = JOptionPane.showConfirmDialog(jd_editor,
                    "Tiene cambios sin guardar. ¿Desea guardar antes de salir?",
                    "Advertencia",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE
            );
        }
        if (opcion == JOptionPane.YES_OPTION) {
            saveFile(currentTextFile, txt_editor.getText()); // No hay archivo seleccionado
            jd_editor.dispose();
        } else {
            jd_editor.dispose();
        }
    }//GEN-LAST:event_jd_editorWindowClosing

    private void btn_abrirExploradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirExploradorActionPerformed
        jd_explorador.pack();
        jd_explorador.setLocationRelativeTo(this);
        jd_explorador.setVisible(true);
    }//GEN-LAST:event_btn_abrirExploradorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla().setVisible(true);
        });
    }

    // ========== Helper Methods ==========
    // ---------- Archivos Binarios ----------
    private ArrayList<Usuario> loadUserFile() {
        File file = new File(CONFIG_FILE_PATH);
        try {
            // Comenzar con la lectura del archivo
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream objectReader = new ObjectInputStream(fi);
            Object obj = objectReader.readObject();
            return (ArrayList<Usuario>) obj;
        } catch (IOException | ClassNotFoundException e) {
        }
        return new ArrayList(); // No encontró nada en el archivo binario
    }

    private void saveUserFile() {
        File file = new File(CONFIG_FILE_PATH);
        try {
            // Escritura del archivo
            FileOutputStream os = new FileOutputStream(file);
            ObjectOutputStream objectWriter = new ObjectOutputStream(os);
            objectWriter.writeObject(usuarios);
            System.out.println("User file saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error");
        }
    }

    private Usuario getActiveUser(String nombre, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)
                    && usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
        }
        return null; // No encotró al usuario
    }

    // ---------- Archivos de Texto ----------
    private File selectFile() {
        JFileChooser fileChooser = new JFileChooser();
        int estado = fileChooser.showSaveDialog(jd_editor);
        /* Nota: si el estado no es JFileChooser.APPROVE_OPTION puede ser que el
        usuario haya cancelado o que haya ocurrido un error. Salir. */
        if (estado == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    private String getFileText(File file) {
        try {
            String texto = "";
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    texto += linea + "\n";
                }
            }
            return texto.stripTrailing();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(jd_editor,
                    "El archivo no se encontró.", "Error", JOptionPane.ERROR_MESSAGE
            );
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(jd_editor,
                    "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE
            );
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    private void writeFile(File file, String text) {
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
                bw.write(text);
            }
            JOptionPane.showMessageDialog(jd_editor, "Se guardó el archivo.",
                    "Información", JOptionPane.INFORMATION_MESSAGE
            );
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(jd_editor,
                    "Algo salió mal. Error al escribir el archivo.", "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveFile(File file, String text) {
        /* Si no hay un archivo abierto, se le pide al usuario guardar el
        archivo actual como un archivo nuevo */
        if (currentTextFile == null) {
            saveFileAs(text);
        } else {
            // Escribir el contendio del textArea en el archivo seleccionado
            writeFile(file, text);
            this.contenidoGuardado = text; // Log del último texto guardado
        }
    }

    private void saveFileAs(String text) {
        this.currentTextFile = selectFile();
        if (currentTextFile != null) {
            saveFile(currentTextFile, text);
        }
    }

    // ---------- Otros ----------
    private void createFirstUser() {
        Administrador usuario = new Administrador(
                usuarios, txt_loginUsuario.getText(),
                txt_loginConstrasena.getText()
        );
        usuarios.add(usuario);
        saveUserFile();
        this.activeUser = usuario;
        JOptionPane.showMessageDialog(this, "¡Bienvenido! \n\n"
                + "Tu usuario ha sido creado con éxito.\n"
                + "¡Gracias por unirte a nuestra plataforma "
                + activeUser.getNombre() + "!", "Primer Usuario",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void loadDesktop(Usuario usuario) {
        // Mostrar escritorio
        jd_escritorio.pack();
        jd_escritorio.setLocationRelativeTo(this);
        jd_escritorio.setVisible(true);
        this.dispose(); // Cerrar ventana de login

        // Cargar modelo
        this.treeModel = new DefaultTreeModel(usuario.getRaiz());
        jt_explorador.setModel(treeModel);

        // Elementos que cambian dependiendo del tipo de usuario
        if (usuario instanceof Administrador) {
            jMenuItem3.setVisible(true);
        } else {
            jMenuItem3.setVisible(false);
        }

        // TODO: Cargar colores y tipo de fuente
    }

    // ---------- Variables Globales ----------
    private ArrayList<Usuario> usuarios;
    private Usuario activeUser;
    private File currentTextFile;
    private String contenidoGuardado;
    private DefaultTreeModel treeModel;
    private static final String CONFIG_FILE_PATH = "./data/users.dat";
    private static final String TEXT_EDITOR_ABOUT = "Este editor de texto ha sido"
            + "desarrollado por Alejandro\n"
            + "Castellanos como parte de un proyecto educativo.\n\n"
            + "Ofrece funcionalidades básicas para abrir, editar y guardar\n"
            + "archivos, además de una interfaz sencilla y eficiente.\n\n"
            + "¡Gracias por usarlo!";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrirEditor;
    private javax.swing.JButton btn_abrirExplorador;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JDialog jd_editor;
    private javax.swing.JDialog jd_escritorio;
    private javax.swing.JDialog jd_explorador;
    private javax.swing.JMenuItem jmi_abrirArchivo;
    private javax.swing.JMenuItem jmi_fuenteEditor;
    private javax.swing.JMenuItem jmi_guardarArchivo;
    private javax.swing.JMenuItem jmi_guardarArchivoComo;
    private javax.swing.JMenuItem jmi_informacionEditor;
    private javax.swing.JTree jt_explorador;
    private javax.swing.JTextArea txt_editor;
    private javax.swing.JTextField txt_loginConstrasena;
    private javax.swing.JTextField txt_loginUsuario;
    // End of variables declaration//GEN-END:variables
}

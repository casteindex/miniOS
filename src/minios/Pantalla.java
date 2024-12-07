/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        this.usuarios = loadUsuarios();
        System.out.println(usuarios);

        /*
        // Ingreso manual de usuarios (BORRAR DESPUÉS):
        this.usuarios = new ArrayList();
        usuarios.add(new Administrador(usuarios, "admin", "admin"));
        usuarios.add(new Administrador(usuarios, "alejandro", "admin"));
        usuarios.add(new Invitado("guest", "temp"));
        usuarios.add(new Invitado("guest2", "temp"));
        saveUsuarios();
         */

 /* Cuando inicie el programa, ocultar el JFrame principal hasta que el
        usuario inicie sesión */
        jd_login.pack();
        jd_login.setVisible(true);
        
    }
    
    private ArrayList<Usuario> loadUsuarios() {
        File file = new File(CONFIG_FILE_PATH);
        try {
            // Comenzar con la lectura del archivo
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream objectReader = new ObjectInputStream(fi);
            Object obj = objectReader.readObject();
            return (ArrayList<Usuario>) obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error");
        }
        return new ArrayList(); // No encontró nada en el archivo binario
    }
    
    private void saveUsuarios() {
        File file = new File(CONFIG_FILE_PATH);
        try {
            // Escritura del archivo
            FileOutputStream os = new FileOutputStream(file);
            ObjectOutputStream objectWriter = new ObjectOutputStream(os);
            objectWriter.writeObject(usuarios);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_loginUsuario = new javax.swing.JTextField();
        txt_loginConstrasena = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jd_editor = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btn_abrirExplorador = new javax.swing.JButton();
        btn_abrirEditor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Bienvenido");

        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setText("Contraseña:");

        btn_login.setText("Iniciar Sesión");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_login)
                            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_loginUsuario)
                                .addComponent(txt_loginConstrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_loginConstrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_login)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu3.setText("Archivo");

        jMenuItem3.setText("Abrir...");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Guardar");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Guardar como...");
        jMenu3.add(jMenuItem5);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Formato");

        jMenuItem2.setText("Fuente...");
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Ayuda");

        jMenuItem1.setText("Aceca del Editor");
        jMenu5.add(jMenuItem1);

        jMenuBar2.add(jMenu5);

        jd_editor.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jd_editorLayout = new javax.swing.GroupLayout(jd_editor.getContentPane());
        jd_editor.getContentPane().setLayout(jd_editorLayout);
        jd_editorLayout.setHorizontalGroup(
            jd_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        jd_editorLayout.setVerticalGroup(
            jd_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_abrirExplorador.setText("explorador");

        btn_abrirEditor.setText("editor");
        btn_abrirEditor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_abrirEditorMouseClicked(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_abrirExplorador)
                    .addComponent(btn_abrirEditor))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btn_abrirExplorador)
                .addGap(52, 52, 52)
                .addComponent(btn_abrirEditor)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        activeUser = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(txt_loginUsuario.getText())
                    && usuario.getContrasena().equals(txt_loginConstrasena.getText())) {
                activeUser = usuario;
                JOptionPane.showMessageDialog(jd_login, "Bienvenido");
            }
        }
        if (activeUser == null) {
            JOptionPane.showMessageDialog(jd_login, "Usuario no encontrado");
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_abrirEditorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abrirEditorMouseClicked
        jd_editor.pack();
        jd_editor.setVisible(true);
    }//GEN-LAST:event_btn_abrirEditorMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables Globales
    private static final String CONFIG_FILE_PATH = "./data/users.dat";
    private ArrayList<Usuario> usuarios;
    private Usuario activeUser;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrirEditor;
    private javax.swing.JButton btn_abrirExplorador;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JDialog jd_editor;
    private javax.swing.JDialog jd_login;
    private javax.swing.JTextField txt_loginConstrasena;
    private javax.swing.JTextField txt_loginUsuario;
    // End of variables declaration//GEN-END:variables
}

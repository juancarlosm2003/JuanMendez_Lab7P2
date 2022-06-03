/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_lab7p2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Juan Carlos Mendez
 */
public class FrameArtistas extends javax.swing.JFrame {

    ArrayList<Lanzamientos> lanzamientos = new ArrayList();
    ArrayList<Canciones> canciones = new ArrayList();


    private void cargartabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        modelo.setRowCount(0);
        for (Lanzamientos lanzamiento : lanzamientos) {
            Object[] row = {lanzamiento.getTitulo(), lanzamiento.getFecha(), lanzamiento.getConteolikes()};
            modelo.addRow(row);
        }
    }

    private void cargartabla2() {
        DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
        modelo.setRowCount(0);
        for (Canciones canciones : canciones) {
            Object[] row = {canciones.getTitulo(), canciones.getDuracion()};
            modelo.addRow(row);
        }
    }

    /**
     * Creates new form FrameArtistas
     */
    public FrameArtistas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_publicacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cont = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_titulo2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_duracion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree1.setBackground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Lanzamiento");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 710));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion de Artistas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 480, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lanzamientos: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Titulo de publicacion: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));
        getContentPane().add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de publicacion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));
        getContentPane().add(txt_publicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 180, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Conteo de likes:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));
        getContentPane().add(txt_cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 180, 30));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Fecha de publicacion", "Conteo de likes"
            }
        ));
        jScrollPane2.setViewportView(tabla1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 410, 140));

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 140, 40));

        jLabel7.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Canciones: \n");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Titulo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));
        getContentPane().add(txt_titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 160, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tiempo de duracion;");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));
        getContentPane().add(txt_duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 160, 30));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo ", "Tiempo de duracion"
            }
        ));
        jScrollPane3.setViewportView(tabla2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 280, 130));

        jButton2.setText("Guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 150, 50));

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/43698.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -10, 3040, 2020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String titulo, fecha;
        int conteo;
        titulo = txt_titulo.getText();
        fecha = txt_publicacion.getText();
        conteo = Integer.parseInt(txt_cont.getText());
        lanzamientos.add(new Lanzamientos(titulo,fecha,conteo));
        txt_titulo.setText("");
        txt_publicacion.setText("");
        txt_cont.setText("");
        cargartabla();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String titulo2;
        int duracion;
        titulo2 = txt_titulo2.getText();
        duracion = Integer.parseInt(txt_duracion.getText());
        canciones.add(new Canciones(titulo2, duracion));
        txt_titulo2.setText("");
        txt_duracion.setText("");
        cargartabla2();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel modelo = (DefaultTreeModel)tabla1.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)modelo.getRoot();
        
        String titulo = (String)tabla1.getValueAt(tabla1.getSelectedRow(), 0);
        
        String fecha = (String)tabla1.getValueAt(tabla1.getSelectedRow(), 1);
        
        int indice = -1;
        for (int i = 0; i < root.getChildCount(); i++)
            if(root.getChildAt(i).toString().equals(titulo)){
                indice = i;
                break;
            }
        
        if(indice > -1){
            //Agregarlo a ese nodo
            DefaultMutableTreeNode tipoNodo = (DefaultMutableTreeNode)root.getChildAt(indice);
            tipoNodo.add(new DefaultMutableTreeNode(fecha));
        }else{
            //Crear ese nodo
            DefaultMutableTreeNode tipoNodo = new DefaultMutableTreeNode(titulo);
            tipoNodo.add(new DefaultMutableTreeNode(fecha));
            root.add(tipoNodo);
        }
        modelo.reload();
    
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameArtistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txt_cont;
    private javax.swing.JTextField txt_duracion;
    private javax.swing.JTextField txt_publicacion;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTextField txt_titulo2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_affairs;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OWNER
 */
public class Student_Information extends javax.swing.JFrame {

    /**
     * Creates new form Student_Information
     */
    DefaultTableModel  dtm=new DefaultTableModel();
    public Student_Information() {
        try {
            initComponents();
            table.setModel(dtm);
            dtm.addColumn("Username");
            dtm.addColumn("Password");
            dtm.addColumn("Address");
            dtm.addColumn("Age");
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Student_Information.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student affairs","ahmed","ahmed1234");
            Statement stat=con.createStatement();
            String sql ="select * from student";
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                dtm.addRow(new Object[]{res.getString("name"),res.getString("password"),res.getString("address"),res.getString("age")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_Information.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        scroll.setOpaque(false);
        scroll.setBackground(new Color(0,0,0,0));
        scroll.getViewport().setOpaque(false);
       
        
        
        table.setGridColor(new Color(0,0,0,0));
        table.setBackground(new Color(0,0,0,0));
        table.setOpaque(false);
        
        b1.setBackground(new Color(0,0,0,0));
        b2.setBackground(new Color(0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show All Studnet Information");
        getContentPane().setLayout(null);

        table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setForeground(new java.awt.Color(0, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setGridColor(new java.awt.Color(102, 102, 102));
        table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table.setSelectionForeground(new java.awt.Color(255, 51, 102));
        scroll.setViewportView(table);

        getContentPane().add(scroll);
        scroll.setBounds(0, 0, 790, 412);

        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 255, 255));
        b2.setText("Eixt");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(487, 430, 100, 38);

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 51, 204));
        b1.setText("Back");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(204, 0, 204), new java.awt.Color(153, 0, 153), new java.awt.Color(204, 0, 204)));
        b1.setOpaque(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(63, 430, 78, 38);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_affairs/4k-wallpaper-architecture-background-1308624.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -4, 790, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        Employee_Action z=new Employee_Action();
                
                z.setSize(600,500);
                z.setLocation(600, 250);
                z.setVisible(true);
                
                this.dispose();
    }//GEN-LAST:event_b1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

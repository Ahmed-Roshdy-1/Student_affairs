/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_affairs;

import java.awt.Color;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OWNER
 */
public class Edit_Student extends javax.swing.JFrame {

    /**
     * Creates new form Edit_information
     */
    DefaultTableModel dtm=new DefaultTableModel();
    public Edit_Student() {
     
        try {
            initComponents();
            table.setModel(dtm);
            dtm.addColumn("Id");
            dtm.addColumn("Username");
            dtm.addColumn("Password");
            dtm.addColumn("Address");
            dtm.addColumn("Age");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student affairs","ahmed","ahmed1234");
            Statement stat=con.createStatement();
            String sql ="select * from student";
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                dtm.addRow(new Object[]{res.getInt("id"),res.getString("name"),res.getString("password"),res.getString("address"),res.getString("age")});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Edit_Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Edit_Student.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Delete");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\College\\Level 2\\Database\\project\\Student_Affairs\\src\\student_affairs\\4k-wallpaper-architecture-background-1308624.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Information");
        setBackground(new java.awt.Color(33, 34, 240));
        getContentPane().setLayout(null);

        table.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        scroll.setViewportView(table);

        getContentPane().add(scroll);
        scroll.setBounds(0, 45, 904, 233);

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(9, 145, 69));
        b1.setText("Edit");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        b1.setOpaque(false);
        b1.setRolloverEnabled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(690, 350, 127, 41);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Please Select On One Row");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(67, 0, 356, 38);

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 204));
        b2.setText("Back");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(25, 347, 92, 41);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_affairs/4k-wallpaper-architecture-background-1308624.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -4, 910, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
        int row=table.getSelectedRow();
        int id =(int) table.getValueAt(row, 0);
        
        
        Update_or_Delete_Student s=new Update_or_Delete_Student(id);
       s.setSize(600, 500);
        s.setLocation(600, 250);
        s.setVisible(true);
        this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please select on one row","Attention",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        Employee_Action z=new Employee_Action();
                
                z.setSize(600,500);
                z.setLocation(600, 250);
                z.setVisible(true);
                
                this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
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
import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class update_or_Delete_Employee extends javax.swing.JFrame {

    /**
     * Creates new form update_or_Delete_Employee
     */
    public update_or_Delete_Employee(int value) {
        try {
            initComponents();
            ID.setText(value+"");
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student affairs","ahmed","ahmed1234");
            Statement stat=con.createStatement();
            String sql="select * from employees where id='"+value+"'  ";
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                name.setText(res.getString("name"));
                password.setText(res.getString("password"));
                address.setText(res.getString("address"));
                age.setText(res.getString("age"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update_or_Delete_Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update_or_Delete_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
         b1.setBackground(new Color(0,0,0,0));
        b2.setBackground(new Color(0,0,0,0));
        b3.setBackground(new Color(0,0,0,0));
    }

    update_or_Delete_Employee() {
        
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

        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        address = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPasswordField2.setText("jPasswordField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 68, 76, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 123, 76, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 169, 76, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 208, 76, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("age");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 253, 76, 24);

        ID.setBackground(new java.awt.Color(102, 102, 102));
        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(204, 204, 204));
        ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        ID.setCaretColor(new java.awt.Color(204, 204, 204));
        ID.setEnabled(false);
        ID.setOpaque(false);
        getContentPane().add(ID);
        ID.setBounds(81, 72, 207, 23);

        name.setBackground(new java.awt.Color(102, 102, 102));
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        name.setCaretColor(new java.awt.Color(204, 204, 204));
        name.setOpaque(false);
        getContentPane().add(name);
        name.setBounds(81, 126, 207, 23);

        password.setBackground(new java.awt.Color(102, 102, 102));
        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        password.setCaretColor(new java.awt.Color(204, 204, 204));
        password.setOpaque(false);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(81, 169, 207, 24);

        address.setBackground(new java.awt.Color(102, 102, 102));
        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(204, 204, 204));
        address.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        address.setCaretColor(new java.awt.Color(204, 204, 204));
        address.setOpaque(false);
        getContentPane().add(address);
        address.setBounds(81, 210, 207, 23);

        age.setBackground(new java.awt.Color(102, 102, 102));
        age.setForeground(new java.awt.Color(204, 204, 204));
        age.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        age.setCaretColor(new java.awt.Color(204, 204, 204));
        age.setOpaque(false);
        getContentPane().add(age);
        age.setBounds(81, 254, 207, 24);

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Updete");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(340, 300, 108, 36);

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(153, 0, 255));
        b1.setText("Delete");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        b1.setOpaque(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(470, 300, 95, 36);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText(" Update Or Delete emploee :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 36, 366, 29);

        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Back");
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        b3.setOpaque(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(10, 310, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_affairs/4k-wallpaper-architecture-background-1308624.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -4, 670, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            int id=Integer.parseInt(ID.getText());
            int Age=Integer.parseInt(age.getText());
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student affairs","ahmed","ahmed1234");
            Statement stat=con.createStatement();
            String sql="update employees set name='"+name.getText()+"',password='"+password.getText()+"',address='"+address.getText()+"',age='"+Age+"'where id='"+id+"'  ";
            int res=stat.executeUpdate(sql);
            
            if(res==1){
                JOptionPane.showMessageDialog(null,"Update Employee  successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                Edit_Employee a=new Edit_Employee();
                a.setSize(800, 500);
                a.setLocation(600, 250);
                a.setVisible(true);
                this.dispose();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update_or_Delete_Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"username is Already existed ,try change username", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int id=Integer.parseInt(ID.getText());
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student affairs","ahmed","ahmed1234");
            Statement stat=con.createStatement();
            String sql="delete from employees where id='"+id+"'  ";
            int res=stat.executeUpdate(sql);
            
            if(res==1){
                JOptionPane.showMessageDialog(null,"Delete Employee  successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                Edit_Employee a=new Edit_Employee();
                a.setSize(800, 500);
                a.setLocation(600, 250);
                a.setVisible(true);
                this.dispose();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update_or_Delete_Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Update_or_Delete_Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        Manager_Action z= new Manager_Action();
                 z.setSize(700, 500);
                 z.setLocation(600, 250);
                 z.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(update_or_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_or_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_or_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_or_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new update_or_Delete_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
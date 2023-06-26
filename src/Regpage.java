/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Ayesh
 */
public class Regpage extends javax.swing.JFrame {

    /**
     * Creates new form Regpage
     */
    public Regpage() {
        initComponents();
        connect();
    }
    Connection conn;
    PreparedStatement ps;
    
    
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Regpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/schooltimetable","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Regpage.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        psd = new javax.swing.JPasswordField();
        cps = new javax.swing.JPasswordField();
        login1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 138, -1, -1));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("preffered user name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 195, -1, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("confirm password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 138, 436, -1));

        uname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 193, 436, -1));

        delete.setBackground(new java.awt.Color(153, 255, 255));
        delete.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 119, -1));

        psd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(psd, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 250, 337, -1));

        cps.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(cps, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 310, 337, -1));

        login1.setBackground(new java.awt.Color(153, 255, 255));
        login1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        login1.setText("Login");
        login1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        getContentPane().add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 109, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton3.setText("Save & register");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 121, -1));

        update.setBackground(new java.awt.Color(153, 255, 255));
        update.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 125, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("id(only for updation and deletion)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 370, 337, -1));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Students' Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 761, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\images project\\4.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 490));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
          String ID= id.getText();
        String Name=name.getText();
        
        String UName=uname.getText();
        


     
     
      try {
            String query="delete from students where user_Id=?";
            ps=conn.prepareStatement(query);
            
            ps.setString(1,ID);
            id.setText("");
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"deleted successful");
        } catch (SQLException ex) {
            Logger.getLogger(Regpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
   
        
    }//GEN-LAST:event_deleteActionPerformed

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        // TODO add your handling code here:
        Slog s1= new Slog();
        s1.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_login1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Name=name.getText();
        
        String UName=uname.getText();
        if(UName.equals("")){
            JOptionPane.showMessageDialog(null,"user name must be entered");
        }
        String Password=psd.getText();
        
        String CPass=cps.getText();
       

if(Name.equals("")){
            JOptionPane.showMessageDialog(null,"name must be entered");
        }
else if(UName.equals("")){
            JOptionPane.showMessageDialog(null,"user name must be entered");
        }
else if(Password.equals("")){
            JOptionPane.showMessageDialog(null,"password must be entered");
        }
else if(!CPass.equals(Password)){
            JOptionPane.showMessageDialog(null,"confirmation is  incorrect, please enter again");
        }
 else if(CPass.equals("")){
            JOptionPane.showMessageDialog(null,"passsowrd  must be confirmed");


}else{
     
     
      try {
            String query="insert into students(Fullname,UserName,Password)values(?,?,?)";
            ps=conn.prepareStatement(query);
            ps.setString(1,name.getText());
            
            ps.setString(2,uname.getText());
            
            ps.setString(3,cps.getText());
            name.setText("");
            uname.setText("");
            cps.setText("");
            psd.setText("");
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"registration successful");
        } catch (SQLException ex) {
            Logger.getLogger(Regpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String ID= id.getText();
        String Name=name.getText();
        
        String UName=uname.getText();
        if(UName.equals("")){
            JOptionPane.showMessageDialog(null,"user name must be entered");
        }
        String Password=psd.getText();
        
        String CPass=cps.getText();
       

if(Name.equals("")){
            JOptionPane.showMessageDialog(null,"name must be entered");
        }
else if(UName.equals("")){
            JOptionPane.showMessageDialog(null,"user name must be entered");
        }
else if(Password.equals("")){
            JOptionPane.showMessageDialog(null,"password must be entered");
        }
else if(!CPass.equals(Password)){
            JOptionPane.showMessageDialog(null,"confirmation is  incorrect, please enter again");
        }
 else if(CPass.equals("")){
            JOptionPane.showMessageDialog(null,"passsowrd  must be confirmed");


}else{
     
     
      try {
            String query="UPDATE students set FullName=?,UserName=?,Password=? where user_Id=?";
            ps=conn.prepareStatement(query);
            ps.setString(1,Name);
            
            ps.setString(2,uname.getText());
            
            ps.setString(3,cps.getText());
            ps.setString(4,ID);
            name.setText("");
            uname.setText("");
            cps.setText("");
            psd.setText("");
            id.setText("");
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"updation successful");
        } catch (SQLException ex) {
            Logger.getLogger(Regpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_updateActionPerformed
  }
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Regpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cps;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField psd;
    private javax.swing.JTextField uname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

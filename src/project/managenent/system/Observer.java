/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managenent.system;

/**
 *
 * @author Syed Afsahul
 */
public class Observer extends javax.swing.JFrame {

    /**
     * Creates new form Observer
     */
    String DpLocation;
    database db = new database();
    int projectID;
    public Observer() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 70, 90, 60);

        jLabel14.setText("phone.....");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(100, 390, 90, 14);

        jLabel11.setText("github.....");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 330, 70, 14);

        jLabel12.setText("linkedin......");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 350, 110, 14);

        jLabel13.setText("email....");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(110, 370, 40, 14);

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
        jLabel4.setText("Descp");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 160, 130, 30);

        jLabel15.setText("project decp....");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(760, 220, 180, 70);

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
        jLabel5.setText("Task List");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 330, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 153));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(750, 100, 160, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 340, 340, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(750, 60, 90, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 180, 90, 60);

        jButton2.setText("View Project");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 430, 120, 23);

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(750, 430, 69, 23);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
        jLabel2.setText("Project Description");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(750, 170, 220, 40);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/member.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -60, 1020, 530);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/member.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-15, 2, 1020, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        project obj = new project();
        obj.viewProject(projectID);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void viewObserver(int userID){
        jLabel10.setText(db.getFromDB("member",userID,"name"));  //name
        jLabel4.setText(db.getFromDB("member",userID,"descp"));  //descp
        jLabel11.setText(db.getFromDB("member",userID,"GithubUrl"));   
        
        projectID = Integer.parseInt(db.getFromDB("member",userID,"projectID"));
        jLabel6.setText(db.getFromDB("project",projectID,"projectName"));
        jLabel15.setText(db.getFromDB("project",projectID,"projectDescp"));
        
        jLabel2.setText(db.getFromDB("member",userID,"LinkedInUrl"));
        jLabel3.setText(db.getFromDB("member",userID,"email"));
        jLabel4.setText(db.getFromDB("member",userID,"contactno"));
        DpLocation =  "";//db.getFromDB("member",userID,"DpLocation");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Observer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Observer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Observer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Observer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Observer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

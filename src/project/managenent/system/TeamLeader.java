/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managenent.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Syed Afsahul
 */
public class TeamLeader extends javax.swing.JFrame {

    /**
     * Creates new form TeamLeader
     */
    String DpLocation;
    int userID;
    String projDesc;
    int projectID;
    database db = new database();
    public TeamLeader() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
        jLabel2.setText("Project Description");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(750, 190, 220, 40);

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(320, 420, 100, 20);

        jLabel12.setText("email....");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(320, 400, 140, 20);

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
        jLabel3.setText("Contact Details");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 400, 160, 30);

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
        jLabel4.setText(" Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 120, 150, 30);

        jLabel14.setText("pro  descp....");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(750, 220, 180, 120);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 153));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(750, 130, 160, 80);

        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(840, 480, 65, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("linkedin...");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 370, 340, 20);

        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("Github...");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 440, 90, 20);

        jButton2.setText("Edit Description");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 480, 120, 23);

        jButton3.setText("View Project");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(410, 480, 100, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 180, 180, 60);

        jLabel10.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
        jLabel10.setText("Project Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(750, 120, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 153));
        jLabel11.setText("Members Desc");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(310, 160, 380, 140);

        jButton1.setText("new project");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(653, 480, 130, 23);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/member.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 1020, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int projectID = 0;
        projectID = Integer.parseInt(db.getFromDB("member",userID,"projectID"));
        if(projectID !=0){
            JOptionPane.showMessageDialog(rootPane,"You are already a leader of a project");
        }else{
            this.dispose();
            new addProject(userID).setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new editDescription(projectID,projDesc,userID).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:  view project
        this.dispose();
        new project(userID).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public void viewLeader(int userID){
        this.userID = userID;
        jLabel9.setText(db.getFromDB("member",userID,"name"));  //name
        jLabel11.setText(db.getFromDB("member",userID,"descp"));  //descp
        jLabel8.setText(db.getFromDB("member",userID,"githuburl"));   
        System.out.println("1 done");
        projectID = Integer.parseInt(db.getFromDB("member",userID,"projectID"));  //String tableName,int PrimaryKey,String Parameter
     //   System.out.println(projectID + "projectID");
        jLabel6.setText(db.getFromDB("project",userID,"projectname"));
        projDesc = db.getFromDB("project",userID,"projectdescp");
        jLabel14.setText(projDesc);
        
        System.out.println("2 done");
        
        jLabel7.setText(db.getFromDB("member",userID,"linkedinurl"));
        jLabel12.setText(db.getFromDB("member",userID,"email"));
        jLabel13.setText(db.getFromDB("member",userID,"contactno"));
        //DpLocation =  "";//db.getFromDB("member",userID,"DpLocation");
        System.out.println("3 done");
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
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamLeader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

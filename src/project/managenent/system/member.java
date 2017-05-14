/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managenent.system;

import javax.swing.JOptionPane;
/**
 *
 * @author student
 */

public class member {
    int userID = 0;
    int projectID = 0;
    database db = new database();
    project projectObj = new project();
    DisplayMember displayMemberObj = new DisplayMember();
    
    public void searchProject(String projectName){
        projectID = Integer.parseInt(db.getFromDB("project",projectName,"projectName"));
        if( projectID == 0){
          // Show message that no project exists with that name
        }else{
            projectObj.viewProject(projectID);
        }
        
    }
    
        public void searchMember(String memberName){
        userID = Integer.parseInt(db.getFromDB("member",memberName,"memberID"));
        if( userID == 0){
          // Show message that no project exists with that name
        }else{
            displayMemberObj.viewMember(userID);
        }
        
    }
        
        public void viewMember(int userID){
            
        }
  //  public void viewProfile(int projectID)
    //search projetdc
    //view project
    //seach member
    
}

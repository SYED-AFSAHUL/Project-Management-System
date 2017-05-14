 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managenent.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author student
 */

public class database {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/project";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";    //password removed for security reasons
    Connection conn = null;
    Statement stmt = null;
    String sql;
    //String result;
    ResultSet rs;
    String result = "";
    String primaryClause;
    int resultInt;
    String addMemName[] = new String[50];
    int i;
    //static database obj = new database();
    
    public database(){
        System.out.println("in constructor");
        this.initDatabase();
    }
    
    public void initDatabase(){
        try{
            System.out.println("in try");
        //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
      

         //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
      
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            System.out.println("finally done");
           // this.getFromDB("member", 1, "name");
            /* //finally block used to close resources
            try{
                if(stmt!=null)
                stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
            conn.close();
            }catch(SQLException se){
            se.printStackTrace();
            }//end finally try
            }//end try*/
        
            // System.out.println(getFromDB("",1,""));
        }
    }
    
    public static void main(String[] args) {
        System.out.println("in main");
        new database();
        //this.initDatabase();
    }//end main
   
    public String getFromDB(String tableName,int PrimaryKey,String Parameter){
        System.out.println("in getFromDB");
        
        switch(tableName){
            case "member":
                primaryClause = "userID";
                break;
            case "project":
                primaryClause = "leaderid";
                break;
            case "backlog":
                primaryClause = "backlogID";
                break;
            case "sprint":
                primaryClause = "sprintID";
                break;
        }
            try{
                System.out.println("in getFromDB- try");
                sql = "SELECT " + Parameter + " FROM " +  tableName + " where " + primaryClause+" = " + PrimaryKey+";";
                //      sql = "SELECT name FROM member where userID = 1";
                System.out.println(stmt.executeQuery(sql));
                rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                while(rs.next()){
                    //Retrieve by column name
                    //int id  = rs.getInt("course");
      
                   // System.out.println("hi");
                    result=rs.getString(Parameter);
                    //Display values
                    System.out.println(result);
                }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       return result;
    }
    
    public String getFromDB(String tableName,String PrimaryKey,String Parameter){
        System.out.println("in getFromDB");
        switch(tableName){
            case "login":
                primaryClause = "username";
                break;
            case "member":
                primaryClause = "userID";
                break;
            case "project":
                primaryClause = "leaderid";
                break;
            case "backlog":
                primaryClause = "backlogID";
                break;
            case "sprint":
                primaryClause = "sprintID";
                break;
        }
            try{
                System.out.println("in 1, try");
               // System.out.println();
                sql = "SELECT " + Parameter + " FROM " +  tableName + " where " + primaryClause + " = " + PrimaryKey+";";
                  //    sql = "SELECT password FROM login where username = 'syed'";
                System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey+";");
                System.out.println(stmt.executeQuery(sql));
                rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                while(rs.next()){
                    //Retrieve by column name
                    //int id  = rs.getInt("course");
      
                 //   System.out.println("hi");
                    result=rs.getString(Parameter);
                    //Display values
                    System.out.println(result);
                }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       return result;
    }
    
    public String getLoginFromDB(String tableName,String PrimaryKey,String Parameter){
        System.out.println("in getLoginFromDB");
            try{
                System.out.println("in getLoginFromDB, try");
                sql = "SELECT " + Parameter + " FROM " +  tableName + " where username = '" + PrimaryKey +"';";
                     // sql = "SELECT password FROM login where username = 'syed'";
                System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
                System.out.println(stmt.executeQuery(sql));
                rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                while(rs.next()){
                    //Retrieve by column name
                    //int id  = rs.getInt("course");
      
                 //   System.out.println("hi");
                    result=rs.getString(Parameter);
                    //Display values
                    System.out.println(result);
                }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       return result;
    }
    
     public String[] getbacklogFromDB(int projectID){
        System.out.println("in getLoginFromDB");
        String backlogreq[] = new String[30];
            try{
                System.out.println("in getbacklogFromDB, try");
                sql = "SELECT requirement FROM backlog where sprintID = 0 and projectID = "+projectID+";";
                     // sql = "SELECT password FROM login where username = 'syed'";
              //  System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
                System.out.println(stmt.executeQuery(sql));
                rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                
                int i=0;
                while(rs.next()){
                    //Retrieve by column name
                    //int id  = rs.getInt("course");
      
                 //   System.out.println("hi");
                    result=rs.getString("requirement");
                    backlogreq[i++]  = result;
                    //Display values
                    System.out.println(result);
                }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       return backlogreq;
    }
    
     public String[] getbacklogFromDBsprint(int sprintID){
        System.out.println("in getLoginFromDB");
        String backlogreq[] = new String[30];
            try{
                System.out.println("in getbacklogFromDB, try");
                sql = "SELECT requirement FROM backlog where sprintID = "+sprintID+";";
                     // sql = "SELECT password FROM login where username = 'syed'";
              //  System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
                System.out.println(stmt.executeQuery(sql));
                rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                
                int i=0;
                while(rs.next()){
                    //Retrieve by column name
                    //int id  = rs.getInt("course");
      
                 //   System.out.println("hi");
                    result=rs.getString("requirement");
                    backlogreq[i++]  = result;
                    //Display values
                    System.out.println(result);
                }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       return backlogreq;
    }
     
    public String[] getAddmember(){
        System.out.println("in getLoginFromDB");
        i=0;
            try{
                System.out.println("in getLoginFromDB, try");
                sql = "SELECT name FROM member where projectID = 0 and userType = 'member';";
                     // sql = "SELECT password FROM login where username = 'syed'";
             //   System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
                System.out.println(stmt.executeQuery(sql));
                rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                while(rs.next()){
                    //Retrieve by column name
                    //int id  = rs.getInt("course");
      
                 //   System.out.println("hi");
                    result=rs.getString("name");
                    addMemName[i++] = result;
                    
                    //Display values
                    System.out.println(result);
                }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       return addMemName;
    }
    
    
     public String[] getSprint(int projectID){
        System.out.println("in getLoginFromDB");
        i=0;
            try{
                System.out.println("in getLoginFromDB, try");
                sql = "SELECT sprintID FROM sprint where projectID = "+projectID+";";
                     // sql = "SELECT password FROM login where username = 'syed'";
             //   System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
                System.out.println(stmt.executeQuery(sql));
                rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                while(rs.next()){
                    //Retrieve by column name
                    //int id  = rs.getInt("course");
      
                 //   System.out.println("hi");
                    result=rs.getString("sprintID");
                    addMemName[i++] = result;
                    
                    //Display values
                    System.out.println(result);
                }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       return addMemName;
    }
    
    public void addMembertoP(int projectID,String name){
        System.out.println("in getLoginFromDB");
            try{
                System.out.println("in getLoginFromDB, try");
                sql = "Update member set projectID = " + projectID + " where name = '" + name+ "';";
                     // sql = "SELECT password FROM login where username = 'syed'";
             //   System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
              //  System.out.println(stmt.executeQuery(sql));
                stmt.executeUpdate(sql);
                //STEP 5: Extract data from result set
//                while(rs.next()){
//                    //Retrieve by column name
//                    //int id  = rs.getInt("course");
//      
//                 //   System.out.println("hi");
//                    result=rs.getString("name");
//                    
                    
                    //Display values
                    System.out.println(result);
                    sql = "commit;";
                    rs = stmt.executeQuery(sql);
               // }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       //return addMemName;
    }
    
    public void addbacklog(String req,int sprintID){
        System.out.println("in getLoginFromDB");
            try{
                System.out.println("in getLoginFromDB, try");
                sql = "update backlog set sprintID = " +sprintID +" where requirement = '" + req+ "';";
                     // sql = "SELECT password FROM login where username = 'syed'";
             //   System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
              //  System.out.println(stmt.executeQuery(sql));
                stmt.executeUpdate(sql);
                //STEP 5: Extract data from result set
//                while(rs.next()){
//                    //Retrieve by column name
//                    //int id  = rs.getInt("course");
//      
//                 //   System.out.println("hi");
//                    result=rs.getString("name");
//                    
                    
                    //Display values
                    System.out.println(result);
                    sql = "commit;";
                    rs = stmt.executeQuery(sql);
               // }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       //return addMemName;
    }
    
      public void addbacklogtodb(int backlogID,int priority,String req,int projectID){
        System.out.println("in addbacklogtodb");
            try{
                System.out.println("in addbacklogtodb, try");
                sql = "Insert into backlog values ("+backlogID+","+priority+",'"+req+"',0,"+projectID+");";
                     // sql = "SELECT password FROM login where username = 'syed'";
             //   System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
              //  System.out.println(stmt.executeQuery(sql));
                stmt.executeUpdate(sql);
                //STEP 5: Extract data from result set
//                while(rs.next()){
//                    //Retrieve by column name
//                    //int id  = rs.getInt("course");
//      
//                 //   System.out.println("hi");
//                    result=rs.getString("name");
//                    
                    
                    //Display values
                    System.out.println(result);
                    sql = "commit;";
                    rs = stmt.executeQuery(sql);
               // }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       //return addMemName;
    }
      
      
       public void addSprint(int projectID,int sprintID){
        System.out.println("in addbacklogtodb");
            try{
                System.out.println("in addbacklogtodb, try");
                sql = "Insert into sprint values ("+projectID+",'null','Not Done',"+sprintID+");";
                     // sql = "SELECT password FROM login where username = 'syed'";
             //   System.out.println("Parameter " + Parameter + " tableName "+ tableName+" primaryClause "+primaryClause+ " PrimaryKey "+PrimaryKey);
              //  System.out.println(stmt.executeQuery(sql));
                stmt.executeUpdate(sql);
                //STEP 5: Extract data from result set
//                while(rs.next()){
//                    //Retrieve by column name
//                    //int id  = rs.getInt("course");
//      
//                 //   System.out.println("hi");
//                    result=rs.getString("name");
//                    
                    
                    //Display values
                    System.out.println(result);
                    sql = "commit;";
                    rs = stmt.executeQuery(sql);
               // }
            }catch(Exception e){e.printStackTrace();}
            
            System.out.println("Goodbye!");
       //return addMemName;
    }
    
    public void insertIntoProject(String projectName,String projectDesc,int leaderID,String startdate,String enddate,String model){
        try{
            sql = "INSERT INTO PROJECT VALUES('"+ projectName+"','"+projectDesc +"',"+leaderID+",'"+startdate +"','"+enddate+"','"+model+"','started');";
            stmt.executeUpdate(sql);
            
            sql = "commit;";
            rs = stmt.executeQuery(sql);
        }catch(Exception e){e.printStackTrace();}
    }
    
    
     public String insertIntoSignup(String username,String password,String firstName,String lastName,String description,String contact,String email,String linkedIn,String github,String userType){
        try{
            sql = "select max(userID) from login group by userID";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                resultInt = rs.getInt("max(userID)");
                System.out.println(resultInt);
                }
           resultInt++;
            System.out.println("resultInt  "+resultInt);
            sql = "INSERT INTO login VALUES('" + username + "','" + password + "'," + resultInt + ");";
            stmt.executeUpdate(sql);
            String name = firstName + " "+ lastName;
            sql = "INSERT INTO member VALUES ("+ resultInt + ",'" + userType + "','" + name + "',0,0,'" + description + "','" + github + "','" + linkedIn + "','" + email + "'," + contact + ",'asd');";
            stmt.executeUpdate(sql);
            
            sql = "commit;";
            rs = stmt.executeQuery(sql);
        }catch(Exception e){e.printStackTrace();}
            return result;
    }
    
//    public void putDataDB(String tableName,String Parameter,int value,int primaryKey){
//        try{
//            sql = "INSERT INTO " + Parameter + "FROM " +  tableName + " where userID = " + primaryKey;
//            rs = stmt.executeQuery(sql);
//
//            //STEP 5: Extract data from result set
//            while(rs.next()){
//                //Retrieve by column name
//                int id  = rs.getInt("course");
//         
//                //Display values
//                System.out.print("COURSE: " + id);
//            }
//        }catch(Exception e){}
//      
//    }
    
     public void putprojDescDB(int projectID,String descp){
        try{
            sql = "update project set projectdescp = '" +  descp + "' where leaderid = " + projectID+";";
            stmt.executeUpdate(sql);

            //STEP 5: Extract data from result set
//            while(rs.next()){
//                //Retrieve by column name
//                int id  = rs.getInt("course");
//         
//                //Display values
//                System.out.print("COURSE: " + id);
//            }
            
            sql = "commit;";
            rs = stmt.executeQuery(sql);
        }catch(Exception e){}
      
    }
    
    public void closeConn(){
        try{
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(Exception e){}
    }
        
}

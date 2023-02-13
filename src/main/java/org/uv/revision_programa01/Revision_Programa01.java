/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.revision_programa01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//Token
//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
/**
 *
 * @author FHATIMA
 */
public class Revision_Programa01 {

    public static void main(String[] args) {
        Connection con=null;
     try{
         String sql="Insert into ejmplo (clave, nombre, direccion, telefono)"+
                 "('01', 'David', 'AV1', '555')";
        String url="jdbc:postgresql://localhost:5432/ejemplo";
        String pwd="123456";
        String user="postgres";
             
        con=DriverManager.getConnection(url,user,pwd);
          Logger.getLogger(Revision_Programa01.class.getName()).log(Level.INFO, "Se conecto...");
          
        Statement st=con.createStatement();
     }catch (SQLException ex){
             Logger.getLogger(Revision_Programa01.class.getName()).log(Level.SEVERE, null, ex);
      }
      finally{
        try{
          if(con!=null)
              con.close();
        } catch (SQLException ex){
             Logger.getLogger(Revision_Programa01.class.getName()).log(Level.SEVERE, null, ex);       
        }
     }     
      
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuhoc.com.csdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanli
 */
public class Database {
    static String user = "root";
    static String pass = "";
    static String url="jdbc:mysql://localhost:3306/javaweb2021?useUnicode=true&characterEncoding=utf8";
    public static Connection KetNoiCSDL()
    {
        Connection cnn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null,ex);
        }
        catch(ClassCastException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null,ex);
        }
        return cnn;
    }

    static Connection KetnoiCSDL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

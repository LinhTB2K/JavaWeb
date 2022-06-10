/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

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
    public static String user = "root";
    public static String pass = "";
    public static String url = "jdbc:mysql://localhost:3306/javaweb2021?useUnicode=true&characterEncoding=UTF-8";
    // hàm KetnoiCSDL() trả về đối tượng java.sql.Connection nếy thành công và ngược lại trả về NULL 
    public static Connection KetnoiCSDL(){
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             cnn = DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        return cnn;
    }
}

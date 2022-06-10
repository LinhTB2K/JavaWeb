/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class tbUser {
    public int Kiemtra(String taikhoan, String matkhau){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbUser WHERE username=? and password=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setString(1, taikhoan);
            smt.setString(2, matkhau);
            ResultSet rs = smt.executeQuery();
            if(rs.next())
                return 1;
            else
                return 0;
        } catch (SQLException ex) {
            Logger.getLogger(tbUser.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}

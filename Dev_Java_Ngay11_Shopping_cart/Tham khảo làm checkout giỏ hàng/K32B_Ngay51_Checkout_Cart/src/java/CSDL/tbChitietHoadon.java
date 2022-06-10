/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsChitietHoadon;
import Models.clsHoadon;
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
public class tbChitietHoadon {
        public int ThemChitietHoadon(clsChitietHoadon cthd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "INSERT INTO tbchitiethoadon VALUES(NULL,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, cthd.getIdhd());
            stm.setInt(2, cthd.getIdsp());
            stm.setInt(3, cthd.getSoluong());
            stm.setInt(4, cthd.getGiamua());
            int n = stm.executeUpdate();
            if(n<=0)
                return 0;
            else
                return 1;
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
}

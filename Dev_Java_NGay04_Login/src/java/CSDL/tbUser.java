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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Manh Truong
 */
public class tbUser {
    public int Kiemtra(String u, String p){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;//lỗi kết nối CSDL
        }
        String sql = "SELECT * FROM tbuser WHERE username=? AND password=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setString(1, u);//gán giá trị từ biến u cho dấu ? thứ 1
            smt.setString(2, p);
            ResultSet rs = smt.executeQuery();
            if(rs.next())//nếu lấy được bản ghi kết quả
                return 1;
            else
                return 0;
        } catch (SQLException ex) {
            Logger.getLogger(tbUser.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//Lỗi câu lệnh SQL
        }
        
    }
}

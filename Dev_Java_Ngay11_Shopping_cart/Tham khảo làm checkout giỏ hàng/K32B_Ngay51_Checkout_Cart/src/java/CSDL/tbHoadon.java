/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

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
public class tbHoadon {
    //ThemHoadon(clsHoadon hoadon) trả về mã hóa đơn vừa thêm
    //trả về -1: lỗi kết nối csdl, -2: lỗi sql; 0: không thêm được; 
    public int ThemHoadon(clsHoadon hoadon){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "INSERT INTO tbhoadon(tennguoimua,dienthoai,ngaynhan,trangthai) "
                + " VALUES(?,?,?,0)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, hoadon.getTennguoimua());
            stm.setString(2, hoadon.getDienthoai());
            stm.setString(3, hoadon.getNgaynhan());
            //stm.setInt(4, hoadon.getTrangthai());
            int n = stm.executeUpdate();
            if(n<=0)
                return 0;
            else{
                ResultSet rs = stm.getGeneratedKeys();
                int last_id = 0;
                if(rs.next())
                    last_id = rs.getInt(1);
                return last_id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
}

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

/**
 *
 * @author Admin
 */
public class tbUser {
    public String user;
    public String fullname;
    public int role;
    public tbUser(){
        this.user = "";
        this.fullname="";
        this.role = 0;
    }
    public int Kiemtra(String user, String pass)
    {
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbUser WHERE username=? and password=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, pass);
            ResultSet rs = stm.executeQuery();//thực thi lệnh sql và trả về các bản ghi
            if(rs.next())//nếu có dữ liệu
            {
                //lưu dữ liệu từ CSDL bảng tbUser vào lớp hiện tại
                this.user=rs.getString("username");
                this.fullname=rs.getString("fullname");
                this.role = rs.getInt("role");
                return 1; //đăng nhập thành công
            }
                else
                return 0;
        } catch (SQLException ex) {
            Logger.getLogger(tbUser.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi câu lệnh sql
        }
    }
}

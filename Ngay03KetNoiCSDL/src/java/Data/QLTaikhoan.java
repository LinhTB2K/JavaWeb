/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Models.clsTaikhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class QLTaikhoan {
    //Có thể sử dụng mạng động dạng ArrayList hoặc Vector
    public ArrayList<clsTaikhoan> Arr = new ArrayList<clsTaikhoan>();
    public Vector<clsTaikhoan> List = new Vector<clsTaikhoan>();
    //<Tenlop> để xác định rõ loại đối tượng mà mảng lưu trữ
    public QLTaikhoan() {
    }
    // Trả về -1 lỗi CSDL, -2 lỗi lệnhh SQL, trả về 0,1,2 số bản ghi
    public int getData()
    {
        clsTaikhoan.Laisuat =0.1f;
        //giả sử khởi tạo 3 đối tượng của clsTaikhoan và đưa vào mảng
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1; //Kết thúc và trả về -1 (Lỗi CSDL)
        String sql = "SELECT * FROM tbTaikhoan";
        try {
            // Thực thi câu truy vấn
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            List.clear();// xóa các phần tử của Vector nếu có
            while(rs.next())
            //
            {
                clsTaikhoan tk = new clsTaikhoan();
                tk.setSoTK(rs.getString("SoTK"));
                tk.setSodu(rs.getFloat("Sodu"));
                List.add(tk);
            }
            
            return List.size();
            
        } catch (SQLException ex) {
            Logger.getLogger(QLTaikhoan.class.getName()).log(Level.SEVERE, null, ex);
            return -2;// Kết thúc và trả về -2 lỗi SQL 
       }
    }
}

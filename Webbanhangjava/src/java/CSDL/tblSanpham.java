/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsSanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoan
 */
public class tblSanpham {
    public Vector<clsSanpham> list = new Vector<clsSanpham>();
    //hàm kết nối CSDL lấy danh sách sản phẩm từ tbSanpham lưu vào list
    //trả về -1 nếu lỗi kết nối, -2 nếu lỗi SQL, 0,1,2,.. số sản phẩm lấy được
    public int LayDSSanpham() {
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbsanpham";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();//thực thi lệnh sql và trả về các bản ghi
            list.clear();//xóa các sản phẩm nếu đang có
            while(rs.next())//lặp từng bản ghi và đưa sản phẩm vào list
            {
                //tạo đối tượng lưu thông tin sản phẩm từ dòng trong rs
                clsSanpham sanpham = new clsSanpham();
                sanpham.setId(rs.getInt("id"));
                sanpham.setMasp(rs.getString("masp"));
                sanpham.setTensp(rs.getString("tensp"));
                sanpham.setGiasp(rs.getInt("giasp"));
                sanpham.setManhom(rs.getInt("manhom"));
                sanpham.setHinhanh(rs.getString("hinhanh"));
                sanpham.setTomtat(rs.getString("tomtat"));
                sanpham.setNoidung(rs.getString("noidung"));
                sanpham.setTrangthai(rs.getBoolean("trangthai"));

                //thêm sản phẩm vào danh sách
                list.add(sanpham);
            }
            return list.size();//trả về số phần tử
        } catch (SQLException ex) {
            Logger.getLogger(tblSanpham.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi câu lệnh sql
        }
    }
    public int ThemSanpham(clsSanpham sp){
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "INSERT INTO tbsanpham VALUES (NULL,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            //gán các giá trị từ đói tượng sp cho các tham số ? trong sql
             
                stm.setString(1, sp.getMasp());
                stm.setString(2, sp.getTensp());
                stm.setInt(3, sp.getGiasp());
                stm.setInt(4, sp.getManhom());
                stm.setString(5, sp.getHinhanh());
                stm.setString(6, sp.getTomtat());
                stm.setString(7, sp.getNoidung());
                stm.setBoolean(8, sp.isTrangthai());
                stm.setInt(9, sp.getId());
                
            int n = stm.executeUpdate();
            return n;//số bản ghi được cập nhật (thêm/sửa/xóa)
        } catch (SQLException ex) {
            Logger.getLogger(tblSanpham.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi câu lệnh sql
        }
    }
    //xóa sản phẩm
    public int XoaSanpham(int id){
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "DELETE FROM tbsanpham WHERE id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            //gán các giá trị từ đói tượng sp cho các tham số ? trong sql
            stm.setInt(1, id);
            int n = stm.executeUpdate();
            return n;//số bản ghi được cập nhật (thêm/sửa/xóa)
        } catch (SQLException ex) {
            Logger.getLogger(tblSanpham.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi câu lệnh sql
        }
    }
    //tìm kiếm sản phẩm theo id
    public int TimSanpham(int id){
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbsanpham WHERE id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();//thực thi lệnh sql và trả về các bản ghi
            list.clear();//xóa các sản phẩm nếu đang có
            if(rs.next())//nếu có dữ liệu
            {
                //tạo đối tượng lưu thông tin sản phẩm từ dòng trong rs
                clsSanpham sanpham = new clsSanpham();
                sanpham.setId(rs.getInt("id"));
                sanpham.setMasp(rs.getString("masp"));
                sanpham.setTensp(rs.getString("tensp"));
                sanpham.setGiasp(rs.getInt("giasp"));
                sanpham.setManhom(rs.getInt("manhom"));
                sanpham.setHinhanh(rs.getString("hinhanh"));
                sanpham.setTomtat(rs.getString("tomtat"));
                sanpham.setNoidung(rs.getString("noidung"));
                sanpham.setTrangthai(rs.getBoolean("trangthai"));
                //thêm sản phẩm vào danh sách
                list.add(sanpham);
            }
            return list.size();//trả về số phần tử
        } catch (SQLException ex) {
            Logger.getLogger(tblSanpham.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi câu lệnh sql
        }
    }
    //sửa sản phẩm
    public int SuaSanpham(clsSanpham sp){
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "UPDATE tbSanpham SET masp=?,tensp=?,giasp=?,manhom=?,hinhanh=?,tomtat=?,noidung=?,trangthai=? WHERE id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            //gán các giá trị từ đói tượng sp cho các tham số ? trong sql
                stm.setString(1, sp.getMasp());
                stm.setString(2, sp.getTensp());
                stm.setInt(3, sp.getGiasp());
                stm.setInt(4, sp.getManhom());
                stm.setString(5, sp.getHinhanh());
                stm.setString(6, sp.getTomtat());
                stm.setString(7, sp.getNoidung());
                stm.setBoolean(8, sp.isTrangthai());
                stm.setInt(9, sp.getId());
            int n = stm.executeUpdate();
            return n;//số bản ghi được cập nhật (thêm/sửa/xóa)
        } catch (SQLException ex) {
            Logger.getLogger(tblSanpham.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi câu lệnh sql
        }
    }
}

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
 * @author Admin
 */
public class tblSanpham {
    public Vector<clsSanpham> list = new Vector<clsSanpham>();
    //hàm kết nối CSDL lấy danh sách sản phẩm từ tbSanpham lưu vào list
    //trả về -1 nếu lỗi kết nối, -2 nếu lỗi SQL, 0,1,2,.. số sản phẩm lấy được
    public int LayDSSanpham(){
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbSanpham";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();//thực thi lệnh sql và trả về các bản ghi
            list.clear();//xóa các sản phẩm nếu đang có
            while(rs.next())//lặp từng bản ghi và đưa sản phẩm vào list
            {
                //tạo đối tượng lưu thông tin sản phẩm từ dòng trong rs
                clsSanpham sanpham = new clsSanpham();
                sanpham.setId(rs.getInt("id"));
                sanpham.setTensp(rs.getString("tensp"));
                sanpham.setGia(rs.getFloat("giasp"));
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
    //thêm sản phẩm
    public int ThemSanpham(clsSanpham sp){
        Connection cnn = CSDL.Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "INSERT INTO tbSanpham VALUES (NULL,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            //gán các giá trị từ đói tượng sp cho các tham số ? trong sql
            
            stm.setString(1, sp.getTensp());
            stm.setFloat(2, sp.getGia());
            stm.setBoolean(3, sp.isTrangthai());
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
        String sql = "DELETE FROM tbSanpham WHERE id=?";
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
        String sql = "SELECT * FROM tbSanpham WHERE id=?";
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
                sanpham.setTensp(rs.getString("tensp"));
                sanpham.setGia(rs.getFloat("giasp"));
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
        String sql = "UPDATE tbSanpham SET tensp=?,giasp=?,trangthai=? WHERE id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            //gán các giá trị từ đói tượng sp cho các tham số ? trong sql
            stm.setString(1, sp.getTensp());
            stm.setFloat(2, sp.getGia());
            stm.setBoolean(3, sp.isTrangthai());
            stm.setInt(4, sp.getId());
            int n = stm.executeUpdate();
            return n;//số bản ghi được cập nhật (thêm/sửa/xóa)
        } catch (SQLException ex) {
            Logger.getLogger(tblSanpham.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi câu lệnh sql
        }
    }
}

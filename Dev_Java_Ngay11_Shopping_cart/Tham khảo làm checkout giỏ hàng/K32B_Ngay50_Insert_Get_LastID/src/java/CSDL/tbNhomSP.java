/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsNhomSP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class tbNhomSP {
    public int TimNhomSP(String tukhoa, Vector<clsNhomSP> dsNhomSP)
    {
        //Vector<clsNhomSP> dsNhomSP=new Vector<clsNhomSP>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        else//nếu kết nối CSDL thành công
        {
            String sql = "SELECT * FROM tbnhomsp";
            if(!tukhoa.equals(""))//nếu từ khóa khác rỗng
            {
                sql = sql + " WHERE tenhom LIKE '%" + tukhoa + "%'";
            }
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                //dslop = new Vector<clsLophoc>();
                while(rs.next()){//duyệt từng bản ghi kết quả select
                    clsNhomSP nhomsp= new clsNhomSP();
                    nhomsp.setManhom(rs.getInt("manhom"));
                    nhomsp.setTenhom(rs.getString("tennhom"));
                    nhomsp.setThutu(rs.getInt("sothutu"));
                    nhomsp.setTrangthai(rs.getBoolean("trangthai"));
                    dsNhomSP.add(nhomsp);
                }
                if(dsNhomSP.size()==0)
                    return 0;
            } catch (SQLException ex) {
                Logger.getLogger(tbNhomSP.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
        return 1;
    }  
    public int ThemNhomSP(clsNhomSP nhomsp){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;//lỗi kết nối csdl
        String sql = "INSERT INTO tbnhomsp VALUES(NULL,?,?,?)";
        try {
            //bổ sung tham số Statement.RETURN_GENERATED_KEYS để trả về giá trị số tự động
            PreparedStatement stm = cnn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, nhomsp.getTenhom());
            stm.setInt(2, nhomsp.getThutu());
            stm.setBoolean(3, nhomsp.isTrangthai());
            int n = stm.executeUpdate();
            if(n<=0)
                return 0;//lỗi không thêm/cập nhật được dữ liệu
            else{
                ResultSet rs = stm.getGeneratedKeys();//lấy các bản ghi số tự động tăng (có trường hợp insert 1 lúc nhiều dòng)
                int last_id=1;
                if (rs.next()){//lấy cột 1 của bản ghi đầu tiên trong ResulSet
                    last_id=rs.getInt(1);
                }
                return last_id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbNhomSP.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//lỗi SQL
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Models.clsTaikhoan;
import java.util.ArrayList;
import java.util.Vector;

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
    public void getData()
    {
        clsTaikhoan.Laisuat =0.1f;
        //giả sử khởi tạo 3 đối tượng của clsTaikhoan và đưa vào mảng
        clsTaikhoan tk1 = new clsTaikhoan("001", 1000000);
        clsTaikhoan tk2 = new clsTaikhoan("002", 2000000);
        //clsTaikhoan tk3 = new clsTaikhoan("003", 3000000);
        //thêm các phần tử vào mảng
        List.add(tk1);
        List.add(tk2);
        //cũng có thể làm tắt 
        List.add(new clsTaikhoan("003", 3000000));
    }
}

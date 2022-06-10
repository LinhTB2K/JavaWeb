/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author vanli
 */
public class QLTaikhoan {
    //có thể sử dụng mảng động dạng ArrayList hoặc Vector
    public ArrayList<clsTaikhoan> Arr = new ArrayList<clsTaikhoan>();
    public Vector<clsTaiKhoan> List = new Vector<clsTaiKhoan>();
    public QLTaikhoan(){}
    public void getData(){
        
        clsTaikhoan.Laisuat = 0.1f;
        //giả sử khởi tạo 3 đối tượng clsTaikhoan và đưa vào mảng
        clsTaikhoan tk1 = new clsTaiKhoan("001",1000000);
        clsTaikhoan tk2 = new clsTaiKhoan("001",2000000);
        clsTaikhoan tk3 = new clsTaiKhoan("001",3000000);
        // thêm các phần tử vào mảng
        list.add(tk1);
        list.add(tk2);
        //cũng có thể làm tắt
        List.add(new clsTaikhoan("003",3000000));
    }
}


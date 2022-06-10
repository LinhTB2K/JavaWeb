/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_Static;

/**
 *
 * @author vanli
 */
public class Demo {
    public static void main(String[] args) {
        // truy cập vào biến hay hàm static thì không cần tạo đối tượng
        //static member là thành phần dùng cung, truy cập: TenLop.tenbien
        clsTaikhoan.Laisuat=0.1f;
        // tạo các đối tượng từ clsTaiKhoan để truy cập vào các non-static member khác
        // mỗi Object (Instance of Class) sẽ có giá trị riêng biệt
        clsTaiKhoan tkA = new clsTaiKhoan("0001",10000000);
        clsTaiKhoan tkB = new clsTaiKhoan();
        tkB.SoTk = "0002";
        tkB.Sodu = 20000000;
    }
    
}

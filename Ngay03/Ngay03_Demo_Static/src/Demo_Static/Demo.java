/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_Static;

/**
 *
 * @author Admin
 */
public class Demo {
    public static void main(String[] args) {
        //truy cập vào biến hay hàm static thì không cần tạo đối tượng
        //static member là thành phần dùng chung, truy cập: TenLop.Tenbien
        clsTaikhoan.Laisuat=0.1f;
        //tạo các đối tượng từ clsTaikhoan để truy cập vào các non-static member
        //mỗi Object (Instance of class) sẽ có giá trị riêng biệt 
        clsTaikhoan tkA = new clsTaikhoan("0001", 10000000);
        clsTaikhoan tkB = new clsTaikhoan();
        tkB.SoTK = "0002";
        tkB.Sodu = 20000000;
        System.out.println("Tài khoản A:"); tkA.Hienthi();
        System.out.println("Tài khoản B:"); tkB.Hienthi();
        System.out.println("Lãi suất chung");clsTaikhoan.HienthiLaisuat();
    }
}

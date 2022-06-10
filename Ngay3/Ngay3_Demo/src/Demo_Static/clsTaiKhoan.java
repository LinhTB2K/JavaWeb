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
public class clsTaiKhoan {
    //instance variable(non-static variable) - thành phần riêng của từng Object
    // phải tạo đối tượng của lớp mới tồn tại và truy cập được riêng cho từng đối tượng
    String SoTk;
    float Sodu;
    // static variable - thành phần chung cho class - mọi đối tượng của class đềo truy cập được
    //cú pháp truy cập : TenLop.StaticMember (thuộc tính hoặc hàm), không cần phải tạo đối tượng nào cả
    static float Laisuat=0.0f;
    
    //hàm hiển thị thông tin 
    //non-static Method : là hàm truy cập riêng vào các thành phần của tường đối tượng
    public static void Hienthi() {
        System.out.println("Số dư TK : " + this.SoTk);
        System.out.println("Số dư : " + this.Sodu);
        System.out.println("Tiền Lãi : " + (this.Sodu*Laisuat));
        // non-static method được phép truy cập vào các static variable hoắc static member là biến dùng chung
        //vì là biến dùng chung
    }
    
    //hàm static chỉ được phép truy cập vào các static member khác
    // không dược truy cập vào các non-static member
    public static void HienthiStatic() {
        System.out.println("lãi suất : " + Laisuat);
        
    }
}


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
public class clsTaikhoan {
    //instance variable (non-static variable) - thành phần riêng của từng Object
    //phải tạo đối tượng của lớp mới tồn tại và truy cập được riêng cho từng đối tượng
    String SoTK;
    float Sodu;
    //static variable - thành phần chung cho class - mọi đối tượng của class đều truy cập
    //cú pháp truy cập: TenLop.StaticMember, không cần phải tạo đối tương nào cả
    static float Laisuat = 0.0f;

    public clsTaikhoan() {
    }

    public clsTaikhoan(String SoTK, float Sodu) {
        this.SoTK = SoTK;
        this.Sodu = Sodu;
    }

    public String getSoTK() {
        return SoTK;
    }

    public void setSoTK(String SoTK) {
        this.SoTK = SoTK;
    }

    public float getSodu() {
        return Sodu;
    }

    public void setSodu(float Sodu) {
        this.Sodu = Sodu;
    }
    //hàm hiển thị thông tin tài khoản:
    //non-static Method: là hàm truy cập riêng vào thành phần của từng đối tượng
    public void Hienthi(){
        System.out.println("Số TK: " + this.SoTK);
        System.out.println("Số dư: " + this.Sodu);
        System.out.println("Tiền lãi: " + (this.Sodu*Laisuat));
        //non-static method được phép truy cập vào các static member 
        //vì static member là thành phần phần dùng chung
    }
    //hàm static thì chỉ được phép truy cập vào các static member khác
    //không được truy cập vào các non-static member
    public static void HienthiLaisuat()
    {
        System.out.println("Lãi suất: " + Laisuat);
        //không được truy cập vào các non-static member
        //System.out.println("Số dư: " + this.Sodu);
    }
}

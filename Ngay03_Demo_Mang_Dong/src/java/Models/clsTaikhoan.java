/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

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
    public static float Laisuat = 0.0f;

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
    
}

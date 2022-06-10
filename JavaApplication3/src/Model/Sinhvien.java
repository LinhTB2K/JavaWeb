/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vanli
 */
public class Sinhvien {
    //Khai bao mot so properties(thuoc tinh)
    String mavs;
    String hoten;
    int tuoi;
    // mot so Constructor(ham tao): la ham trung ten voi lop de khoi tao Object(doi tuong)
    //Khong khai bao du lieu tra ve cua ham
    public Sinhvien(){
        
    }
    public Sinhvien(String masv,String hoten,int tuoi){
        this.mavs = masv;
        this.hoten = hoten;
        this.tuoi = tuoi;
    }
    public void Hienthi(){
        System.out.println("Ho ten :" + this.hoten + "Tuoi :"+ tuoi+"Ma sinh vien :"+mavs);
    }
    //mot so Method()
}

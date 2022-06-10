/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/**
 *
 * @author vanli
 */
public class Demojava2 {
    public static void main(String[] arg){
        ConNguoi cn1;
        cn1 = new ConNguoi();
        ConNguoi cn2 = new ConNguoi("Tên 2", 20);
        cn1.setHoten("Tên1");
        cn1.gioitinh =true;
        cn1.sodienthoai = "01234456";
        cn1.email = "abc@gmail.com";
//        cn1.setTuoi(-1);
        System.out.println("Cn1");
        System.out.println("Tên :" + cn1.getHoten());
        System.out.println("Tuổi :"+ cn1.getTuoi());
        System.out.println("Tên : " + cn2.getHoten());
        System.out.println("Tuổi 2 : "+ cn2.getTuoi());
        
//        Sinhvien sv1 =new Sinhvien;
//        sv1.
    }
    
}

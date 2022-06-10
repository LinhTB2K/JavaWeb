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
public class ConNguoi {
    private String hoten;
    private int tuoi;
    protected boolean gioitinh;
    public String sodienthoai;
    String email;
    
    public ConNguoi(){
        hoten ="Nguyễn Vanư Linh";
        tuoi = 21;
    }
    public ConNguoi(String hoten,int tuoi){
        this.hoten = hoten;
        this.tuoi = tuoi;
    }
    public String getHoten(){
        return this.hoten;
    }
    public void setHoten(String hoten)
    {
        if(hoten.equals("")==false)
            this.hoten=hoten;
    }
    public int getTuoi(){
    return tuoi;
    }
    public void setTuoi(int tuoi){
    if(tuoi>0){
        
    }}
    public void Hienthi()
    {
        System.out.println("Tên : "+ this.hoten);
        System.out.println("Email : "+ this.email);
        System.out.println("Số điện thoại : "+this.sodienthoai);
    }
}

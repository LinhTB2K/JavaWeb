/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Sinhvien;
/**
 *
 * @author vanli
 */
public class Demo1 {
    public static void main(String[] arg)
    {
        Model.Sinhvien sv1 = new Model.Sinhvien("Sv81 ","A ",21);
        //Khi da import Model.Sinhvien
        Sinhvien sv2 = new Sinhvien("Sv2 ","B ",20);
        sv1.Hienthi();
        sv2.Hienthi();
    }
}

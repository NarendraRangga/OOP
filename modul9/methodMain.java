/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
public class methodMain {
    public static void main(String[] args) {
        Cube cb = new Cube();
        System.out.println("Keliling = "+ cb.keliling()+ "\nLuas = "+ cb.luas());
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("keliling = "+pp.keliling() +"\nluas = "+ pp.luas());
        
        jajarGenjang jj = new jajarGenjang();
        System.out.println("keliling = "+jj.keliling() +"\nluas = "+ jj.luas());
       
        Lingkaran lg = new Lingkaran();
        System.out.println("keliling = "+lg.keliling()+"\nluas = "+ lg.luas());
        
        segitiga ss = new segitiga();
        System.out.println("keliling = "+ss.keliling() +"\nluas = "+ ss.luas());
    }
}

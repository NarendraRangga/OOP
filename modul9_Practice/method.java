/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9_Practice;

/**
 *
 * @author HP
 */
public class method {
        public static void main(String[] args) {
        Balok cb = new Balok();
        System.out.println("luas selimut = "+ cb.luasselimut()+ "\nvolume = "+ cb.volume());
        
        Kerucut pp = new Kerucut();
        System.out.println("luas selimut = "+pp.luasselimut()+"\nvolume = "+ pp.volume());
        
        Kubus jj = new Kubus();
        System.out.println("luas selimut = "+jj.luasselimut()+"\nvolume = "+ jj.volume());
       
        prismaSegitiga lg = new prismaSegitiga();
        System.out.println("luas selimut = "+lg.luasselimut()+"\nvolume = "+ lg.volume());
        
    }
}


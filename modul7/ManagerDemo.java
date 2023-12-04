/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author HP
 */
public class ManagerDemo {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setNama("tony");
        m1.setGaji(2000000);
        m1.setUsia(21);
        
        System.out.println(m1.getNama());
        System.out.println(m1.getjamKerja());
        System.out.println(m1.getUsia());
        System.out.println( m1.getGajiManager());
        
        Manager m3 = new Manager();
        m3.setNama("Mary");
        m3.setGaji(1500000);
        m3.setUsia(31);
        
        Manager m4 = new Manager();
        m4.setNama("po");
        m4.setGaji(300000);
        m4.setUsia(23);
        
        Manager m5 = new Manager();
        m5.setNama("tonyp");
        m5.setGaji(1900000);
        m5.setUsia(26);
        
        Manager m6 = new Manager();
        m6.setNama("Cony");
        m6.setGaji(3100000);
        m6.setUsia(45);
        
        Manager m2 = new Manager();
        m2.setNama("Nami");
        m2.setGaji(2000000);
        m2.setUsia(21);
        m2.setjamKerja(8.45f);
        
        System.out.println(m3.getNama()+"\n"+m3.getGaji()+"\n"+m3.getUsia()+"\n"+m3.getGajiManager());
        System.out.println(m4.getNama()+"\n"+m4.getGaji()+"\n"+m4.getUsia()+"\n"+m4.getGajiManager());
        System.out.println(m5.getNama()+"\n"+m5.getGaji()+"\n"+m5.getUsia()+"\n"+m5.getGajiManager());
    }
}

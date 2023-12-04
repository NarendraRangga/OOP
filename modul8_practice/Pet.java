/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8_practice;

/**
 *
 * @author HP
 */
public class Pet {
    private String nama;
    
    public void beriNama(String beriNama){
        this.nama = beriNama;
    }
    
    public String panggilNama(){
        return this.nama;
    }
    
    public String perilaku(){
        return ("Good Boy");
    }
}

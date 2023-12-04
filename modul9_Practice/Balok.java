/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9_Practice;

/**
 *
 * @author HP
 */
public class Balok extends Abstract3d{
    int panjang = 3;
    int lebar = 4;
    int tinggi = 5;
    
    public int luasselimut(){
        return (2*(panjang*lebar)+2*(panjang*tinggi)+2*(lebar*tinggi));
    }
    
    public int volume(){
        return panjang*lebar*tinggi;
    }
}

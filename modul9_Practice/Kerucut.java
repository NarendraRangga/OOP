/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9_Practice;

/**
 *
 * @author HP
 */
public class Kerucut extends Abstract3d{
    int radius = 3;
    int tinggi = 4;
    int sisi = 5;
    
    public int luasselimut(){
        return (int) (Math.PI*radius*(radius+sisi));
    }
    
    public int volume(){
        return (int) (Math.PI*radius*radius*tinggi/3);
    }
}

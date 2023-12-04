/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9_Practice;

/**
 *
 * @author HP
 */
public class Kubus extends Abstract3d{
    int sisi = 3;
    
    public int luasselimut(){
        return sisi*sisi*sisi;
    }
    
    public int volume(){
        return 6*(sisi*sisi);
    }
}

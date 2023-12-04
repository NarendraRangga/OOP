/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9_Practice;

/**
 *
 * @author HP
 */
public class prismaSegitiga extends Abstract3d{
    int tinggi = 4;
    int alas = 3;
    int sisiMiring = 5;
    int sisiTegak = 10;
    
    public int luasselimut(){
        return (int) (2*(0.5*alas*tinggi)+3*(sisiMiring*sisiTegak));
    }
    
    public int volume(){
        return (int)((0.5*tinggi*alas)*sisiTegak);
    }
}

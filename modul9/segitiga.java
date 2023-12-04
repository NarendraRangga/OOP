/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
public class segitiga {
    int sisiAlas = 4;
    int sisiTinggi = 3;
    int sisiMiring = 5;
    
    public int luas(){
        return (int) (0.5*sisiAlas*sisiTinggi);
    }
    public int keliling(){
        return sisiMiring+sisiMiring+sisiAlas;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
public class jajarGenjang extends methodAbstract{
    int sisiAlas = 4;
    int Tinggi = 3;
    int sisiMiring = 5;
    
   
    public int keliling(){
        return 2*(Tinggi+sisiMiring);
    }
    
    public int luas(){
        return sisiAlas*Tinggi;
    }
}

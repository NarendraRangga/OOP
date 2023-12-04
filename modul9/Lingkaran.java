/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
public class Lingkaran extends methodAbstract{
    int radius = 7;
    int diameter =14;
    
    
    public int keliling(){
        return  (int) (Math.PI*diameter);
    }
    
    public int luas(){
        return (int) (Math.PI*radius*radius);
    }
}

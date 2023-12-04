/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author HP
 */
public class Watercycle extends Bicycle{
    void Run(){
        System.out.println("Only capable to run on "+"Water ");
    }
    public static void main(String[] args) {
        Bicycle bb = new Watercycle();
        bb.Run();
    }
}

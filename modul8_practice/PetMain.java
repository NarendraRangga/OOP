/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8_practice;

/**
 *
 * @author HP
 */
public class PetMain {
    public static void main(String[] args) {
        Pet kocheng = new Cat();
        Pet Doggo = new Dog();
        kocheng.beriNama("TOM");
        System.out.println(kocheng.panggilNama());;
        System.out.println(kocheng.perilaku());
        Doggo.beriNama("BULL");
        System.out.println(Doggo.panggilNama());
        System.out.println(Doggo.perilaku());
        
        Eagle mabur = new Eagle();
        mabur.beriNama("Mickey");
        System.out.println(mabur.panggilNama());;
        System.out.println(mabur.perilaku());
        System.out.println(mabur.jalan());
    }
}

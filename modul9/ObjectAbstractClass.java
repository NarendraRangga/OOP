/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
public class ObjectAbstractClass {
    public static void main(String[] args) {
        AbstractClass ac = new AbstractClass(2, 3, 4){};
        
        DerivativeofAbstract pc = new DerivativeofAbstract(2, 3, 2);
            pc.printX();
            System.out.println(pc.kali());
    }
}

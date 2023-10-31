/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author HP
 */
public class InheritanceTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.MessageA();
        b.MessageB();
        b.MessageA();
        c.MessageC();
        c.MessageB();
        c.MessageA();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
public class DerivativeofAbstract extends AbstractClass {
int x;
    public DerivativeofAbstract(int a, int b, int c) {
        super(a, b, c);
        this.x = a+b+c;
    }
    public void printX(){
        System.out.println(x);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
abstract class AbstractClass {
    int a;
    int b;
    int c;
    public AbstractClass (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int kali(){
        return a*b*c;
    }
}

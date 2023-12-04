/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

import modul11.OuterDemo2;

/**
 *
 * @author HP
 */
public class OuterDemoMain {
    public static void main(String[] args) { 
 //Membuat Object OuterDemo
 OuterDemo2 outer = new OuterDemo2();
 
 //Membuat Object InnerDemo
 OuterDemo2.Inner_Demo inner = 
 outer.new Inner_Demo();
 System.out.println(inner.getNum());
    }
}



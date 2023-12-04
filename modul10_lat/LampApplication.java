/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10_lat;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LampApplication {
    public static void main(String[] args) {
    Lamp lampu = new Lamp();
    Scanner sc = new Scanner(System.in);
    lampu.statusLampu = lampu.setSaklar(0);
    System.out.println("Status Lampu = “+lampu.statusLampu+”\nketikkan");
    System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu \n2 untuk merdeupkan lampu");

while (true) {
        System.out.println("Status Lampu : "+lampu.statusLampu);
        System.out.print("Masukan pilihan: ");
        int N = sc.nextInt();


        if(N==0){
            lampu.matikanLampu();
        }else if(N==2){
            lampu.redupkanLampu();
        }else if(N==1){
            lampu.hidupkanLampu();
        }else{
            System.out.println("Inputan salah");
            break;
            }
        }
    }
}
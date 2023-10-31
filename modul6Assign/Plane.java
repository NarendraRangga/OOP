/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6Assign;

/**
 *
 * @author HP
 */
public class Plane extends Kendaraan{
       public static void main(String[] args) {  
           int jumlahSayap = 4;    
           Kendaraan kendaraan2 = new Kendaraan();
           System.out.println("Plane's Color: "+ kendaraan2.warnaBody + "\nFuel Capacity: "
           + kendaraan2.bahanBakar + "\nTire made from: " + kendaraan2.ban + "\nWings: " + jumlahSayap);
      }
}


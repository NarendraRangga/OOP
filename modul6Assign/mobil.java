/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6Assign;

/**
 *
 * @author HP
 */
public class mobil extends Kendaraan {
    public static void main(String[] args) {
        int jumlahPintu = 4;
        Kendaraan kendaraan1 = new Kendaraan();
        System.out.println("Car's Color: "+ kendaraan1.warnaBody + "\nFuel Capacity: "
        + kendaraan1.bahanBakar + "\nTire made from: " + kendaraan1.ban + "\nDoor: " + jumlahPintu);
    }
}

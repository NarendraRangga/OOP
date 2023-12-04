/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8_bank;
import java.util.Date;

/**
 *
 * @author HP
 */
public class customerData {
    String nama;
    String alamat;
    Date tanggalLahir;
    String Pekerjaan;
    int gaji;
    
  public customerData() {
    }

    public customerData(String name, String address, Date birthDate, String occupation, int salary) {
        this.nama = name;
        this.alamat = address;
        this.tanggalLahir = new Date (birthDate.getTime()) ;
        this.Pekerjaan = occupation;
        this.gaji = salary;
    }

    public void printCustomerDetails() {
        System.out.println("Name: " + nama);
        System.out.println("Address: " + alamat);
        System.out.println("Birth Date: " + tanggalLahir);
        System.out.println("Occupation: " + Pekerjaan);
        System.out.println("Salary: " + gaji);
        System.out.println();
    }

    public static void main(String[] args) {
        customerData c1 = new customerData("Rizal", "Bali", new Date(), "Mahasiswa", 1000000);
        customerData c2 = new customerData("Budi", "Jakarta", new Date(), "Programmer", 1500000);
        customerData c3 = new customerData("Siti", "Jakarta", new Date(), "Guru", 1230000);
        customerData c4 = new customerData("Ami", "Bali", new Date(), "PNS", 1000000);
        customerData c5 = new customerData("Joko", "Lombok", new Date(), "Programmer", 500000);

        // Print customer details
        c1.printCustomerDetails();
        c2.printCustomerDetails();
        c3.printCustomerDetails();
        c4.printCustomerDetails();
        c5.printCustomerDetails();
    }

    private String Date(long time) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

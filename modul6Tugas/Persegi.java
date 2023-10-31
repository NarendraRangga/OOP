/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6Tugas;

/**
 *
 * @author HP
 */
public class Persegi extends BangunDatar {
    double sisi;
            
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Methods
    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}

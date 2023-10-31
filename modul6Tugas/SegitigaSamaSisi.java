/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6Tugas;

/**
 *
 * @author HP
 */
public class SegitigaSamaSisi extends Segitiga {
    // Constructor
    public SegitigaSamaSisi(double sisi) {
        super(sisi, Math.sqrt(3) / 2 * sisi);
    }

    // Methods
    @Override
    public double hitungKeliling() {
        return 3 * alas;
    }
}
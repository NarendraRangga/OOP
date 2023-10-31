/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6Tugas;

/**
 *
 * @author HP
 */
public class SegiTigaSamaKaki extends Segitiga {
    private double sisimiring;

    public SegiTigaSamaKaki(double alas, double tinggi, double sisimiring) {
        super(alas, tinggi);
        this.sisimiring = sisimiring;
    }

    // Methods
    public double hitungKeliling() {
        return 2 * sisimiring + alas;
    }
}

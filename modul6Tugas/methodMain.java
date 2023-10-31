/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6Tugas;

/**
 *
 * @author HP
 */
public class methodMain {
        public static void main(String[] args) {
        persegiPanjang persegianjang1 = new persegiPanjang(5, 3);
        Persegi persegi = new Persegi(4);
        SegiTigaSamaKaki segitigaKaki = new SegiTigaSamaKaki(4, 5, 4);
        SegitigaSamaSisi segitigaSisi = new SegitigaSamaSisi(6);

        // Test the results of the shapes
        System.out.println("Luas dan Keliling Persegi Panjang:");
        System.out.println("Luas: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling: " + persegiPanjang.hitungKeliling());

        System.out.println("\nLuas dan Keliling Persegi:");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());

        System.out.println("\nLuas dan keliling Segitiga adalah:");
        System.out.println("Luas: " + segitigaKaki.hitungLuas());
        System.out.println("Keliling: " + segitigaKaki.hitungKeliling());

        System.out.println("\nLuas dan Keliling Segitiga Sama Kaki:");
        System.out.println("Luas: " + segitigaKaki.hitungLuas());
        System.out.println("Keliling: " + segitigaKaki.hitungKeliling());

        System.out.println("\nLuas dan Keliling Segitiga Sama Sisi:");
        System.out.println("Luas: " + segitigaSisi.hitungLuas());
        System.out.println("Keliling: " + segitigaSisi.hitungKeliling());
    }
}


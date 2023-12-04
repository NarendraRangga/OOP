/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8_bank;

/**
 *
 * @author HP
 */
public class BankDemo{
	public static void main(String[] args) {
		Bank b = new Bank();
		BankPribadi bp = new BankPribadi();
		BankUmum bu = new BankUmum();
		BankPasar bps = new BankPasar();
		BankSyariah bss = new BankSyariah();
        System.out.println("rasio bunga : " + b.rasioBunga());
		System.out.println("rasio bunga pribadi : " + bp.rasioBunga());
		System.out.println("rasio bunga umum : " + bu.rasioBunga());
		System.out.println("rasio bunga pasar : " + bps.rasioBunga());
		System.out.println("rasio bunga syariah : " + bss.rasioBunga());
	}
}

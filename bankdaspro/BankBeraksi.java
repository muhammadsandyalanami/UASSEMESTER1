/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankdaspro;

/**
 *
 * @author Asus
 */
public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal Rp. 100000
        Bank bank = new Bank(100000);

        // Menampilkan informasi awal
        System.out.println("Selamat Datang di BankDASPRO");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        // Menyimpan uang Rp. 500000
        bank.simpanUang(500000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        // Mengambil uang Rp. 150000
        bank.ambilUang(150000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
    }
}

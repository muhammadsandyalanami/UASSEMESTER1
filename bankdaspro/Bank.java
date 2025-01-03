/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankdaspro;

/**
 *
 * @author Asus
 */
public class Bank {
    private int saldo;  
    
    public Bank(int saldoAwal) {
        saldo = saldoAwal;
    }

    // Method simpan uang 
    public void simpanUang(int jumlah) {
        saldo += jumlah;  
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    // Method ambil uang 
    public void ambilUang(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;  
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk menarik uang sebesar Rp. " + jumlah);
        }
    }

    // Method dapatkan saldo 
    public int getSaldo() {
        return saldo;
    }
}
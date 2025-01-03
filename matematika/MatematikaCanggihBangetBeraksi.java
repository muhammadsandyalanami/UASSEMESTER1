/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Asus
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget matematika = new MatematikaCanggihBanget();

        // Operasi matematika Canggih Banget
        System.out.println("Pertambahan: 20 + 20 = " + matematika.pertambahan(20, 20));
        System.out.println("Perkalian: 10 * 20 = " + matematika.perkalian(10, 20));
        System.out.println("Modulus: 21 % 4 = " + matematika.modulus(21, 4));  
        System.out.println("Pertambahan Tiga: 10 + 20 + 30 = " + matematika.pertambahanTiga(10, 20, 30)); 
    }
}
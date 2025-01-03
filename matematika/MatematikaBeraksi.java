/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Asus
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
    Matematika matematika = new Matematika();
    
    // Pemanggilan Method 
        System.out.println("Pertambahan: 20 + 20 = " + matematika.pertambahan(20, 20));
        System.out.println("Pengurangan: 10 - 5 = " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian: 10 * 20 = " + matematika.perkalian(10, 20));
        System.out.println("Pembagian: 20 / 2 = " + matematika.pembagian(20, 2));
    } 
}


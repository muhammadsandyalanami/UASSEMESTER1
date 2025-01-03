/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Asus
 */
public class MatematikaCanggih extends Matematika {
// Modulus 2 parameter bertipe int 
    public int modulus(int a, int b) {
        return a % b; 
    }
    
// Modulus 3 parameter bertipe int 
    public int modulus(int a, int b, int c){
        return a % b % c;
    }

// PECAHAN 
    // Pecahan 3 parameter dengan tipe int 
        public double pecahan(int a, int b, int c) {
            return a / (b + c);
        }
}
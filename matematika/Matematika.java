/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author Asus
 */
public class Matematika {
// PERTAMBAHAN 
    // Pertambahan 
       public int pertambahan(int a, int b) {
           return (a + b);
       }
       
    // Pertambahan tipe Double deengan 3 parameter 
       public double pertambahan(double a, double b, double c){
           return a + b + c ;
       }
       
    // Pertambahan tipe Double dengan 2 parameter
       public double pertambahan(double a, double b){
           return a + b ;
       }
       
    // Pertambahan tipe Int dengan 3 parameter 
       public int pertambahan(int a, int b, int c) {
           return a + b + c ;
       }

//PENGURANGAN        
    // Pengurangan  
       public int pengurangan(int a, int b) {
           return (a - b);
       }
    
    // Pengurangan tipe double dengan 3 parameter 
       public double pengurangan(double a, double b, double c){
           return a - b - c ;
       }
       
// PERKALIAN 
    // Perkalian 
       public int perkalian(int a, int b) {
        return (a * b);
       }
       
    // Perkalian tipe double dengan 3 parameter 
       public double perkalian(double a, double b, double c){
           return a * b * c;
       }
       
//PEMBAGIAN 
    // Pembagian 
       public int pembagian(int a, int b) {
        return (a / b);
       }
    // Pembagian tipe double dengan 3 parameter
       public  double pembagian(double a, double b, double c){
       return a / b / c; 
       }
       
//MODULUS 
    // modulus dengan 2 parameter int
    public int modulus(int a, int b) {
        return a % b;
    }

    // modulus dengan 3 parameter double
    public double modulus(double a, double b, double c) {
        return a % b % c;
    }

// PECAHAN 
    // Method pecahan yang menerima 3 parameter double
    public double pecahan(double a, double b, double c) {
        return a / (b + c);
    }
}
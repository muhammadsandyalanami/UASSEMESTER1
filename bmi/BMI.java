/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author WINDOWS 10
 */
public class BMI {

    float tinggi;
    float berat;

    public BMI(float tinggi, float berat) {
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }

    public float hitung() {
        return berat / (tinggi * tinggi);
    }

    public String getStatus() {
        float bmi = hitung();

        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Berat berlebih";
        } else {
            return "Obesitas";
        }
    }
}

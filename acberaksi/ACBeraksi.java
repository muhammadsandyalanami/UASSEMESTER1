/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acberaksi;

/**
 *
 * @author Asus
 */
public class ACBeraksi{
public static void main(String[] args){
ACRumah acrumah = new ACRumah();
System.out.println("Status AC Rumah Saat In: Mati");
    acrumah.hidupkan();
    acrumah.matikan();
}
}
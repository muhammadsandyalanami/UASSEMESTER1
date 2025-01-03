/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acberaksi;

/**
 *
 * @author Asus
 */
public class ACRumah implements InterfaceAC {
 int statusACRumah;
 public void hidupkan(){
if (statusACRumah == KEADAAN_MATI){
statusACRumah = KEADAAN_HIDUP;
System.out.println("Hidupkan AC Rumah! --> AC Hidup");
}else{
System.out.println("Hidupkan AC Rumah! --> AC Sudah Hidup Boss!!");}
}
 public void matikan(){
if (statusACRumah == KEADAAN_HIDUP){
statusACRumah = KEADAAN_MATI;
System.out.println("Matikan AC Rumah! --> AC Mati");
}else{
System.out.println("Matikan AC Rumah! --> AC Sudah Mati Boss!!");
}
}
}
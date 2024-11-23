/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalno4;

import java.util.Scanner;

public class Soalno4 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Regristasi user");
        System.out.print("Masukan nama:");
        String regisNama=scanner.nextLine();
        System.out.println("Masukkan pasword:");
        String regisPasword=scanner.nextLine();
        
        System.out.println("Login user");
        
 
        System.out.print("Masukkan nama:");
        String loginNama=scanner.nextLine();
        System.out.print("Masukkan pasword:");
        String loginPasword=scanner.nextLine();
        
        String output=loginNama.equals(regisNama)&& loginPasword.equals(regisPasword)?"Namamu adalah "+regisNama:"data tidak ditemukan";
        System.out.println(output);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constass;

import  java.util.Scanner;
public class ConstAss {

    public static void main(String[] args){
String s = "filkom";
String val = (s.equals("filkom"))?"Brawijaya": "null";
System.out.println(s+" "+val);

Scanner scanner=new Scanner(System.in);
String nama=scanner.nextLine();
String nim=scanner.nextLine();
if(nim.equals("245150200111048")){
    System.out.printf("Nama:%s\n",nama);
    System.out.printf("NIM:%s\n",nim);
}else {
       System.out.println("Input NIM salah");
      }
        
   }
    
}

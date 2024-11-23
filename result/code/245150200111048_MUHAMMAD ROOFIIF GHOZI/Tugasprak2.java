/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprak2;

import java.util.Scanner;
public class Tugasprak2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int berat;
       double tinggi;
       
        System.out.print("Berat badan (kg)    :");
        berat=in.nextInt();
        System.out.print("Tinggi badan (m)    :");
        tinggi=in.nextDouble();
        double imt=(double)berat/(tinggi*tinggi);
        System.out.printf("IMT = %.2f ", imt);
        if (imt <= 18.5) {
            System.out.println("Termasuk kurus");
        } else if (imt > 18.5 && imt <= 25) {
            System.out.println("Termasuk normal");
        } else if (imt > 25 && imt <= 30) {
            System.out.println("Termasuk gemuk");
        } else {
            System.out.println("Termasuk kegemukan");
        }
        System.out.print("\nBerat badan (kg)    :");
        berat=in.nextInt();
        System.out.print("Tinggi badan (m)    :");
        tinggi=in.nextDouble();
        double imt2 = (double) berat / (tinggi * tinggi);
        System.out.printf("IMT = %.2f ", imt2);
        if (imt2 <= 18.5) {
            System.out.println("Termasuk kurus");
        } else if (imt2 > 18.5 && imt2 <= 25) {
            System.out.println("Termasuk normal");
        } else if (imt2 > 25 && imt2 <= 30) {
            System.out.println("Termasuk gemuk");
        } else {
            System.out.println("Termasuk kegemukan");
        }
        
    }
       
    
    
}

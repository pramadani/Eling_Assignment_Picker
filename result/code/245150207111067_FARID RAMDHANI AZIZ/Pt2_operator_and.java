
package pt2_operator_and;
  import java.util.Scanner;
public class Pt2_operator_and {

    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         System.out.print("masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai * 2 < 50) {
            nilai += 10;
        }
        /*Menggunakan operator AND (&&) untuk mengecek lebih dari satu kondisi sekaligus 
        untuk mengurangi nested if
        */
        if (nilai <= 20 && nilai % 2 == 1) {
            System.out.println("Filkom");
            System.out.println("UB");
        } else if (nilai <= 20 && nilai % 2 == 0) {
            System.out.println("Filkom");
            System.out.println("Brawijaya");
        } else if (nilai > 20 && nilai % 2 == 1) {
            System.out.println("PTIIK");
            System.out.println("UB");
        } else {
            System.out.println("PTIIK");
            System.out.println("Brawijaya");
        }   
    }   
}
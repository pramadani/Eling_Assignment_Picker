package pt2_nested_if;
  import java.util.Scanner;
public class Pt2_Nested_if {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     
     System.out.print("masukkan nilai: ");
        int nilai = input.nextInt();
        // mengecek apakah nilai * 2 lebih kecil dari 50. Jika iya, maka nilai ditambahkan dengan 10 
        if (nilai * 2 < 50) {
            nilai += 10;
        }
        //Setelah itu, dilakukan pengecekan apakah nilai lebih kecil atau sama dengan 20:
        if (nilai <= 20) {
            System.out.println("Filkom");
            //Jika benar (nilai ganjil), output "UB" akan ditampilkan.
            //Jika salah (nilai genap), output "Brawijaya" akan ditampilkan.
        if (nilai % 2 == 1) {
            System.out.println("UB");
        } else {
            System.out.println("Brawijaya");
        }
        } else {
            System.out.println("PTIIK");
        if (nilai % 2 == 1) {
            System.out.println("UB");
        } else {
            System.out.println("Brawijaya");
        
          }
        }   
    }
}

/*
Jika nilai lebih besar dari 20:

Output "PTIIK" akan ditampilkan.
Kemudian dicek apakah nilai ganjil (nilai % 2 == 1):
Jika benar (nilai ganjil), output "UB" akan ditampilkan.
Jika salah (nilai genap), output "Brawijaya" akan ditampilkan.
*/
/*
Input: 10

nilai * 2 = 20 (lebih kecil dari 50), maka nilai += 10 → nilai menjadi 30.
nilai <= 20 → cetak "Filkom".
nilai % 2 == 0 (genap), maka cetak "Brawijaya".

Input: 30

nilai * 2 = 60 (lebih besar dari 50), maka nilai tidak berubah (30).
nilai > 20 → cetak "PTIIK".
nilai % 2 == 0 (genap), maka cetak "Brawijaya".
*/
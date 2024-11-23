
package pt2_conditionall_assignment;
  import java.util.Scanner;
public class Pt2_Conditionall_Assignment {

    public static void main(String[] args) {
    
        String s = "filkom";
           String val = (s=="filkom")?"Brawijaya": "null"; 
           System.out.println(s+" "+val);
           
           Scanner input = new Scanner (System.in);
           
           String nama, NIM;
           System.out.print("Masukkan nama : ");
           nama = input.nextLine();
           System.out.print("Masukkan NIM : ");
           NIM = input.nextLine();
           
           
        String validasiNama = nama.equals("farid") ? "valid" : "salah";  
        String validasiNim = NIM.equals("245150207") ? "valid" : "salah"; 

        
        if (validasiNama.equals("valid") && validasiNim.equals("valid")) {
            System.out.println("Nama: " + nama + ", NIM: " + NIM);
        } else {
            if (validasiNama.equals("salah")) {
                System.out.println("Input nama salah");
            }
            if (validasiNim.equals("salah")) {
                System.out.println("Input NIM salah");
            }
        }
    }
  }
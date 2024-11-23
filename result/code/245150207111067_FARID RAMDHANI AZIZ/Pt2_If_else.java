package pt2_if_else;
  import java.util.Scanner;
public class Pt2_If_else {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan nilai: "); 
          int nilai = input.nextInt();
           if (nilai > 60)
              System.out.println("Anda lulus"); 
           else if (nilai >= 40)
              System.out.println("Nilaikurang!");
           else{
              System.out.println("Anda gagal");
            
         }
        
    }
    
}

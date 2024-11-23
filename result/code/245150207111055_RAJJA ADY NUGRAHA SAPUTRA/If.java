import java.util.Scanner;
public class If {
   public static void main(String []args){
      Scanner in = new Scanner(System.in);
      System.out.print("masukan nilai : ");
      int nilai = in.nextInt();

      if (nilai > 60 )
         System.out.println("Anda lulus");
      else if (nilai >= 40 )
         System.out.println("Nilai kurang ! ");
      else{
         System.err.println("Anda gagal");

      }

}

}
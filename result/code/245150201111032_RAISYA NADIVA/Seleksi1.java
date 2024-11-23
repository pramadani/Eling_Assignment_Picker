import java.util.Scanner;

public class Seleksi1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = in.nextInt();
        if (nilai > 60)
            System.out.println("x: Anda lulus");
        else{
            System.out.println("Anda harus mengulang !");
            System.out.println("Anda gagal");
        }
    }
}

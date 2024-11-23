import java.util.Scanner;
public class soalNo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = in.nextLine();

        System.out.print("Masukkan Password : ");
        String password = in.nextLine();

        System.out.println("");
        System.out.println("LOGIN USER");

        System.out.print("Nama : ");
        String nama2 = in.nextLine();
        System.out.print("Password : ");
        String password2 = in.nextLine();
        
        System.out.println("");

        String output = (nama.equals(nama2) && password.equals(password2))? "Nama user : "+nama:"data tak ditemukan";
        System.out.println(output);
    }
}
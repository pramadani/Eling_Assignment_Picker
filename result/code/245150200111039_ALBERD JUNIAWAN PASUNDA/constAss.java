import java.util.Scanner;

public class constAss{
    public static void main(String[] args){
        String s = "filkom";
        String val = (s.equals("filkom"))?"Brawijaya": "null"; 
        System.out.println(s+" "+val);
        Scanner beto = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = beto.nextLine();
        System.out.print("NIM : ");
        String nim = beto.nextLine();
        System.out.println("Masukkan kembali datanya");
        System.out.print("Nama : ");
        String na = beto.nextLine();
        System.out.print("NIM : ");
        String ni = beto.nextLine();
        if(na.equals(nama) && ni.equals(nim))System.out.println(nama + "\n" + nim);
        else System.out.println("data tak ditemukan");
    }
}
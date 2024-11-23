    import java.util.Scanner;
    public class ConstAss{
        public static void main(String[] args){ 
            Scanner input = new Scanner(System.in);
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya": "null"; 
        System.out.println("Masukkan nama anda : ");
        String nama = input.next();
        System.out.println("Masukkan NIM anda : ");
        String NIM = input.next();
        if (!nama.equals("Inyo")){
        System.out.println("data tak ditemukan");
        return;
        }
        else if (!NIM.equals("245150201111030")){
            System.out.println("data tak ditemukan");
        return;
        }
        else if (nama.equals("Inyo") && NIM.equals("245150201111030")){
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + NIM);
        }
        System.out.println(s+" "+val);
        System.out.println();
        }
    }

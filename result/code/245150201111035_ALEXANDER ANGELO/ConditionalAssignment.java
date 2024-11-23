import java.util.Scanner;
public class ConditionalAssignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya": "null";
        System.out.println(s+" "+val);

        System.out.print("Nama : ");
        String nama = in.nextLine();
        System.out.print("NIM : ");
        String NIM = in.nextLine();

        System.out.println("");

        System.out.println(nama.equalsIgnoreCase("Alexander Angelo")?"Nama : "+nama:"input nama salah");
        System.out.println(NIM.equals("245150201111035")?"NIM  : "+NIM:"input nim salah");
    }
}


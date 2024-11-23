import java.util.Scanner;
public class ConditionalAss {
    public static void main(String[] args) {
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya": "";
        Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        String nim = input.nextLine();

        String val2 = (nama.equals("Naufal Abiyyu Arhab"))?nama : "nama salah";
        System.out.println(val2);

        String val3 = (nim.equals("245150201111029"))?nim : "nim salah";
        System.out.println(val3);

        // soal 4

        String user = input.nextLine();
        String password = input.nextLine();

        String user2 = input.nextLine();
        String password2 = input.nextLine();

        String fal = (user2.equals(user) && password2.equals(password))? user2+" "+password2 : "data tidak ditemukan";
        
        System.out.println(fal);

        System.out.println(s+" "+val);

        input.close();
    }
}

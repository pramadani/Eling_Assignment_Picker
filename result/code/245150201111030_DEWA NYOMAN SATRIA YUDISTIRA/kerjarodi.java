import java.util.Scanner;
public class kerjarodi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jam kerja : ");
    int jamkerja = input.nextInt();
    int normal;
    int lembur;
    int denda;

    if(jamkerja <= 60 && jamkerja >= 50){
        normal = jamkerja*5000;
        lembur = 0;
        denda = 0;
    }
    else if(jamkerja > 60){
        normal = 60*5000;
        lembur = (jamkerja-60)*6000;
        denda = 0;
    }
    else{
        normal = jamkerja*5000;
        lembur = 0;
        denda = (50-jamkerja)*1000;
    }
    int gaji = normal+lembur+denda;
    System.out.println("Upah = Rp. " + normal);
    System.out.println("Lembur = Rp. " + lembur);
    System.out.println("Denda = Rp. " + denda);
    System.out.println("---------------------");
    System.out.println("Total = Rp. " + gaji);

    System.out.println("Dewa Nyoman // 245150201111030");
    }
}

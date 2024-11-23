import java.util.Scanner;

public class prog3 {
    public static void main(String[] args){
        Scanner beto = new Scanner(System.in);
        System.out.print("Jam kerja     : ");
        int jam = beto.nextInt();
        if(jam<50){
            System.out.println("Upah   = Rp. " + (5000*jam));
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. " + ((50-jam)*1000));
            int total = (5000*jam)-(50-jam)*1000;
            System.out.println("---------------------\nTotal = Rp. " + total);
        }
        else if(jam<60){
            System.out.println("Upah   = Rp. " + (5000*jam));
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. 0");
            int total = (5000*jam);
            System.out.println("---------------------\nTotal = Rp. " + total);
        }
        else{
            System.out.println("Upah   = Rp. " + (5000*60));
            System.out.println("Lembur = Rp. " + (6000*(jam-60)));
            System.out.println("Denda = Rp. 0");
            int total = (5000*jam)+6000*(jam-60);
            System.out.println("---------------------\nTotal = Rp. " + total);
        }
    }
}

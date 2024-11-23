import java.util.Scanner;

public class Penggajian {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Jam kerja: ");
    int jamkerja = in.nextInt();

    int max = 60;
    int min = 50;
        
    if(jamkerja > max) {
        int kelebihanjam = jamkerja-max;
        int upah = max*5000;
        int lembur = kelebihanjam*6000;
        int denda = 0;
        int total = upah+lembur-denda;
        System.out.println("Upah   = Rp. "+ upah);
        System.out.println("Lembur = Rp. "+ lembur);
        System.out.println("Denda  = Rp. "+ denda);
        System.out.println("---------------------");
        System.out.println("Total  : Rp. "+ total);
    } else if(jamkerja >= min && jamkerja <= max){
        int upah = jamkerja*5000;
        int lembur = 0;
        int denda = 0;
        int total = upah+lembur-denda;
        System.out.println("Upah   = Rp. "+ upah);
        System.out.println("Lembur = Rp. "+ lembur);
        System.out.println("Denda  = Rp. "+ denda);
        System.out.println("---------------------");
        System.out.println("Total  : Rp. "+ total);        
    } else if(jamkerja < min){
        int kelebihanjam = min - jamkerja;
        int denda = kelebihanjam*1000;
        int upah = jamkerja*5000;
        int lembur = 0;
        int total = upah+lembur-denda;
        System.out.println("Upah   = Rp. "+ upah);
        System.out.println("Lembur = Rp. "+ lembur);
        System.out.println("Denda  = Rp. "+ denda);
        System.out.println("---------------------");
        System.out.println("Total  : Rp. "+ total);
    
    }

    }
}


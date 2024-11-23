
    import java.util.Scanner;
    public class bataskerja2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int jamkerja;
        int jamlembur;
        int jamkurang;
        int totalupah;
        int upahnormal = 5000;
        int upahlembur = 6000;
        int denda = 1000;
        int batasmaks = 60;
        int batasmin = 50;
        System.out.println("Masukkan jam kerja pegawai dalam seminggu:");
        jamkerja = scanner.nextInt();
        jamlembur = scanner.nextInt();
        jamkurang = scanner.nextInt();
        totalupah = scanner.nextInt();
        if (jamkerja > batasmaks){
          jamlembur = jamkerja - batasmaks;
          totalupah = (batasmaks*upahnormal) + (jamlembur*upahlembur);

        }else if (jamkerja < batasmin){
            jamkurang = batasmin - jamkerja;
            totalupah = (jamkerja*upahnormal)- (jamkurang*denda);

        }else{
            totalupah = jamkerja*upahnormal;
        }
       System.out.printf("Jam kerja: %-8s\n", jamkerja);
       System.out.printf("Upah= %-8s\n", totalupah);
       System.out.printf("Lembur= %-8s\n", upahlembur);
       System.out.printf("Denda= %-8s\n", denda );
       System.out.println("---------------------");
       System.out.printf("Total= %-8s\n", totalupah );
    }
}


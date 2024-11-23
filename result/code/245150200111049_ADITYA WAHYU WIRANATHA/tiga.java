import java.util.Scanner;
public class tiga {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int jamKerja, upah, lembur, denda;
//1
        System.out.printf("%-15s %s","Jam kerja", ": ");
        jamKerja= userInput.nextInt();
        if (jamKerja<=60 && jamKerja>=50) {
            upah = jamKerja * 5000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", "0");
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", "0");
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah);
            System.out.println();
        }else if (jamKerja>60) {
            upah = 60 * 5000;
            lembur = (jamKerja-60)*6000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", lembur);
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", "0");
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah+lembur);
            System.out.println();
        }else if (jamKerja<50 && jamKerja>=0){
            upah = jamKerja*5000;
            denda = (50-jamKerja)*1000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", "0");
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", denda);
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah-denda);
            System.out.println();
        } else {
            System.out.println("Error");
        }
//2
        System.out.printf("%-15s %s","Jam kerja", ": ");
        jamKerja= userInput.nextInt();
        if (jamKerja<=60 && jamKerja>=50) {
            upah = jamKerja * 5000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", "0");
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", "0");
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah);
            System.out.println();
        }else if (jamKerja>60) {
            upah = 60 * 5000;
            lembur = (jamKerja-60)*6000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", lembur);
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", "0");
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah+lembur);
            System.out.println();
        }else if (jamKerja<50 && jamKerja>=0){
            upah = jamKerja*5000;
            denda = (50-jamKerja)*1000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", "0");
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", denda);
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah-denda);
            System.out.println();
        } else {
            System.out.println("Error");
        }
//3
        System.out.printf("%-15s %s","Jam kerja", ": ");
        jamKerja= userInput.nextInt();
        if (jamKerja<=60 && jamKerja>=50) {
            upah = jamKerja * 5000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", "0");
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", "0");
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah);
            System.out.println();
        }else if (jamKerja>60) {
            upah = 60 * 5000;
            lembur = (jamKerja-60)*6000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", lembur);
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", "0");
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah+lembur);
            System.out.println();
        }else if (jamKerja<50 && jamKerja>=0){
            upah = jamKerja*5000;
            denda = (50-jamKerja)*1000;
            System.out.printf("%-5s %8s %d\n","upah" , "= Rp.", upah);
            System.out.printf("%-5s %7s %s\n","Lembur" , "= Rp.", "0");
            System.out.printf("%-5s %8s %s\n","Denda" , "= Rp.", denda);
            System.out.println("----------------------");
            System.out.printf("%-5s %8s %s\n","Total" , "= Rp.", upah-denda);
            System.out.println();
        } else {
            System.out.println("Error");
        }
    }
}
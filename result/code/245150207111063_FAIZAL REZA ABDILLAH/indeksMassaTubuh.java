import java.util.Scanner;

public class indeksMassaTubuh {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String kelas;
        String kelas2;

        System.out.print("Berat badan (kg)  : ");
        int beratBadan1 = in.nextInt();
        System.out.print("Tinggi badan (m)  : ");
        double tinggiBadan1 = in.nextDouble();

        double IMT = beratBadan1/(tinggiBadan1*tinggiBadan1);

        if(IMT <= 18.5){
            kelas = "kurus";
        } else if (IMT > 18.5 && IMT <= 25) {
            kelas = "normal";
        } else if (IMT > 25 && IMT <= 30) {
            kelas = "gemuk";
        } else {
            kelas = "kegemukan";
        }
        System.out.printf("IMT = %.2f termasuk %s \n\n", IMT, kelas);

        System.out.print("Berat badan (kg)  : ");
        int beratBadan2 = in.nextInt();
        System.out.print("Tinggi badan (m)  : ");
        double tinggiBadan2 = in.nextDouble();

        double IMT2 = beratBadan2/(tinggiBadan2*tinggiBadan2);

        if(IMT2 <= 18.5){
            kelas2 = "kurus";
        } else if (IMT2 > 18.5 && IMT2 <= 25) {
            kelas2 = "normal";
        } else if (IMT2 > 25 && IMT2 <= 30) {
            kelas2 = "gemuk";
        } else {
            kelas2 = "kegemukan";
        }
        System.out.printf("IMT = %.2f termasuk %s", IMT2, kelas2);
    }
}

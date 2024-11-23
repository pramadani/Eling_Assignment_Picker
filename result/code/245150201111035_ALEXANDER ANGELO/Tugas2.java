    import java.util.Scanner;
    public class Tugas2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Berat badan (kg) : ");
            int bb = in.nextInt();
            System.out.print("Tinggi badan (m) : ");
            float tinggi = in.nextFloat();

            float imt = bb/(tinggi*tinggi);
            String kriteria;

            if (imt <= 18.5){
                kriteria = "Kurus";
            } 
            else if (imt <= 25) {
                kriteria = "Normal";
            }
            else if (imt <= 30) {
                kriteria = "Gemuk";
            }
            else {
                kriteria = "Kegemukan";
            }

            System.out.printf("IMT = %.2f   Termasuk %s", imt, kriteria);
        }
    }

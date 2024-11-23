import java.util.Scanner;
public class IMT {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Berat badan (kg)  :");
    int bb = in.nextInt();
    System.out.print("Tinggi badan (m)  :");
    float tb = in.nextFloat();
    double imt = ((double)bb/(tb*tb));
    String status;
    if (imt>30){
      status = "kegemukan";
    }
    else if (imt>25){
      status = "gemuk";
    }
    else if (imt>18.5){
      status = "normal";
    }
    else {
      status = "kurus";
    }
    System.out.printf("IMT = %.2f termasuk %s",imt,status);
  }
}

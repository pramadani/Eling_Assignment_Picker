import java.util.Scanner;
public class upahkerja {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.printf("%-14s:   ","Jam kerja");
    int jam = in.nextInt();
    int upah = 0;
    int lembur = 0;
    int denda = 0;
    if(jam>60){
      lembur = (jam-60)*6000;
      upah = 60*5000;
    }
    else if (jam<50){
      denda = (50-jam)*1000;
      upah = jam*5000;
    }
    else{upah = jam*5000;}
    
    System.out.printf("Upah   = Rp. %7d\n",upah);
    System.out.printf("Lembur = Rp. %7d\n",lembur);
    System.out.printf("Denda  = Rp. %7d\n",denda);
    System.out.println("--------------------");
    System.out.printf("Total  = Rp. %7d", upah+lembur-denda);
  }
}

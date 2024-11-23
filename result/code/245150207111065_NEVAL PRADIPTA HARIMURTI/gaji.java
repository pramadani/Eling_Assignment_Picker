import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        double upah, lembur, denda,total ;

        Scanner sc = new Scanner(System.in);
        System.out.printf("%-18s%s","Jam Kerja",":");
        double jk = sc.nextDouble();

        if (jk<=60 && jk>=50 ){
            upah = jk *5000 ; 
            lembur = 0 ;
            denda = 0 ; 
            total = upah + lembur+denda;
            System.out.printf("%-10s%s%s%.0f\n","Upah","=","Rp. ",upah);
            System.out.printf("%-10s%s%s%.0f\n","Lembur","=","Rp. ",lembur);
            System.out.printf("%-10s%s%s%.0f\n","Denda","=","Rp. ",denda);
            System.out.println("---------------------");
            System.out.printf("%-10s%s%s%.0f\n","total","=","Rp. ",total);

           
        }
        if (jk>=60  ){
            double upah_s = jk-60;
            upah = 60*5000 ; 
            lembur =upah_s*6000;
            denda = 0 ; 
            total = upah + lembur+denda;
            System.out.printf("%-10s%s%s%.0f\n","Upah","=","Rp. ",upah);
            System.out.printf("%-10s%s%s%.0f\n","Lembur","=","Rp. ",lembur);
            System.out.printf("%-10s%s%s%.0f\n","Upah","=","Rp. ",denda);
            System.out.println("---------------------");
            System.out.printf("%-10s%s%s%.0f\n","total","=","Rp. ",total);


           
        }
        if (jk<=50 ){
            upah = jk *5000 ; 
            lembur = 0 ;
            denda = jk*1000 ; 
            total = upah + lembur+denda;
            System.out.printf("%-10s%s%s%.0f\n","Upah","=","Rp. ",upah);
            System.out.printf("%-10s%s%s%.0f\n","lembur","=","Rp. ",lembur);
            System.out.printf("%-10s%s%s%.0f\n","denda","=","Rp. ",denda);
             System.out.println("---------------------");S
            System.out.printf("%-10s%s%s%.0f\n","total","=","Rp. ",total);
           
        }  
    }
}


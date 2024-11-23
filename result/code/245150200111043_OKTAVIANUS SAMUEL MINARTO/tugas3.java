package praktikum.praktikumpemdasmodul2;

import java.util.*;
public class tugas3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int upah,lembur,denda,total;
        upah = 0;
        lembur=0;
        denda=0;
        System.out.printf("%-18s : ","Jam Kerja");
        int jam = in.nextInt();
        if(jam<50){
            denda=(50-jam)*1000;
            upah = jam*5000;
        }else if(jam>60){
            lembur=(jam-60)*6000;
            upah = 60*5000;
        } else {
        upah = jam*5000;
        }
        System.out.printf("%-18s : Rp. %d\n","Upah",upah);
        System.out.printf("%-18s : Rp. %d\n","Lembur",lembur);
        System.out.printf("%-18s : Rp. %d\n","Denda",denda);
        total=upah+lembur-denda;
        System.out.println("--------------------------------");
        System.out.printf("%-18s : Rp. %d\n\n","Total",total);
        in.close();
    }
}

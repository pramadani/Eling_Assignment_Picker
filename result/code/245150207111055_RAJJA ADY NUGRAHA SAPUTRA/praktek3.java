import java.util.Scanner;
public class praktek3 {
    public static void main(String[] args) {
        System.out.println("jam kerja : ");
    
    Scanner input = new Scanner(System.in);
    System.out.print("masukan jam kerja : ");
    
    int jam1 = input.nextInt();
    int uang1 = (jam1 > 60)? 60*5000 : jam1*5000;
    int lembur1 =(jam1 > 60)? (jam1-60)*6000:0;
    int denda1 =(jam1<50)? (50-jam1)*1000:0;
    int hasil1 = uang1+lembur1-denda1;

    if(jam1 <= 60 && jam1 >= 50){
        System.out.println("Upah = Rp." + uang1);
        System.out.println("Lembur = Rp." + lembur1);
        System.out.println("Denda = Rp." + denda1);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil1);
    }else if(jam1 > 60){
        System.out.println("Upah = Rp." + jam1*5000);
        System.out.println("Lembur = Rp." + (jam1 - 60) * 6000);
        System.out.println("Denda = Rp. 0 ");
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil1);
    }else if(jam1< 50 && jam1 >=0){
        System.out.println("Upah = Rp." + jam1*5000);
        System.out.println("Lembur = Rp. 0");
        System.out.println("Denda = Rp. " + (50 - jam1) * 1000);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil1);
    }else {
        System.out.println("Input tidak valid");    
    }

    System.out.println();
    System.out.print("masukan jam kerja : ");

    int jam2 = input.nextInt();
    int uang2 = (jam2 > 60)? 60*5000 : jam2*5000;
    int lembur2 =(jam2 > 60)? (jam2-60)*6000:0;
    int denda2 =(jam2<50)? (50-jam2)*1000:0;
    int hasil2 = uang2+lembur2-denda2;

    if(jam2 <= 60 && jam2 >= 50){
        System.out.println("Upah = Rp." + uang2);
        System.out.println("Lembur = Rp." + lembur2);
        System.out.println("Denda = Rp." + denda2);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil2);
    }else if(jam2 > 60){
        System.out.println("Upah = Rp." + jam2*5000);
        System.out.println("Lembur = Rp." + (jam2 - 60) * 6000);
        System.out.println("Denda = Rp. 0 ");
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil2);
    }else if(jam2< 50 && jam2 >=0){
        System.out.println("Upah = Rp." + jam2*5000);
        System.out.println("Lembur = Rp. 0");
        System.out.println("Denda = Rp. " + (50 - jam2) * 1000);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil2);
    }else {
        System.out.println("Input tidak valid");    
    }

    System.out.println();
    System.out.print("masukan jam kerja : ");

    int jam3 = input.nextInt();
    int uang3 = (jam3 > 60)? 60*5000 : jam3*5000;
    int lembur3 =(jam3 > 60)? (jam3-60)*6000:0;
    int denda3 =(jam3<50)? (50-jam3)*1000:0;
    int hasil3 = uang3+lembur3-denda3;

    if(jam3 <= 60 && jam3 >= 50){
        System.out.println("Upah = Rp." + uang3);
        System.out.println("Lembur = Rp." + lembur3);
        System.out.println("Denda = Rp." + denda3);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil3);
    }else if(jam3 > 60){
        System.out.println("Upah = Rp." + jam3*5000);
        System.out.println("Lembur = Rp." + (jam3 - 60) * 6000);
        System.out.println("Denda = Rp. 0 ");
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil3);
    }else if(jam3< 50 && jam3 >=0){
        System.out.println("Upah = Rp." + jam3*5000);
        System.out.println("Lembur = Rp. 0");
        System.out.println("Denda = Rp. " + (50 - jam3) * 1000);
        System.out.println("---------------------");
        System.out.println("Total = Rp. " + hasil3);
    }else {
        System.out.println("Input tidak valid");    
    }




    






    



    
        
    }
}
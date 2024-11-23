package tugaslaprak2.seminarjava1;
import java.util.Scanner;

public class permen {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        int permen = scanner.nextInt();
        int anton = permen/3;
        System.out.println("Anton:"+ anton + "permen");
        int budiono = permen/3;
        System.out.println("budiono:" + budiono + " permen");

        int caca = permen/3;
    
        System.out.println("caca:"+ (caca) + "permen");
        int permen_david = permen %3;
        System.out.println ("david:"+permen_david+ "permen");

        
}
    
}

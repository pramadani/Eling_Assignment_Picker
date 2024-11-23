import java.util.Scanner;
    public class praktek1 {
        public static void main(String[] args) {
            System.out.println("Menu :");
            System.out.println("1.menghitung luas dan keliling persegi panjang");
            System.out.println("2.menghitung luas dan keliling lingkaran");
            System.out.println("3.menghitung luas dan keliling segitiga");
10
            Scanner input = new Scanner(System.in);
            System.out.print("masukan menu :");
            String menu = input.nextLine();
            switch (menu) {
                case "1" :
                System.out.print("masukan panjang : ");
                int panjang = input.nextInt();
                System.out.print("masukan lebar : ");
                int lebarpersegipanjang = input.nextInt();
                int kelilingpersegipanjang = (panjang + lebarpersegipanjang) * 2;
                int luaspersegipanjang = (panjang * lebarpersegipanjang);
                System.out.println("keliling persegi panjang : " + kelilingpersegipanjang + "cm");
                System.out.println("luas persegi panjang : " + luaspersegipanjang + "cm" );
                break;

                case "2" :
                System.out.print("masukan jari-jari : ");
                int jari = input.nextInt();
                double kelilinglingakaran = (jari + jari) * 3.14;
                double luaslingkaran = (jari * jari) * 3.14;
                System.out.println("keliling lingkaran : " + kelilinglingakaran + "cm");
                System.out.println("luaslingkaran : " + luaslingkaran + "cm");
                break;
                
                case "3" :
                System.out.print("masukan tinggi : ");
                int tinggi = input.nextInt();
                System.out.print("masukan sisi miring : ");
                int sisimiring = input.nextInt();
                System.out.print("masukan alas : ");
                int alas = input.nextInt();
                int kelilingsegitiga = (tinggi + sisimiring + alas);
                double luassegitiga = (alas * tinggi) * 0.5;
                System.out.println("keliling segitiga : " + kelilingsegitiga + "cm");
                System.out.println("luas segitiga : " + luassegitiga + "cm");
                break;

                default:
                System.out.println("Data tak ditemukan, program dihentikan ");




            





                
                
            }

            
        }

    }

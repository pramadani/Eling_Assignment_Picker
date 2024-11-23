import java.util.Scanner;
public class TugasPraktikum2Arsyad{
    public static void main(String[] args) {
        //penugasan 1
        Scanner input = new Scanner(System.in);
        //menu
        System.out.println("Menu : ");
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("1.Menghitung luas dan keliling persegi panjang");
        System.out.println("2.Menghitung luas dan keliling lingkaran");
        System.out.println("3.Menghitung luas dan keliling segitiga siku siku");
        System.out.println();
        System.out.println("--------------------------------------------------");
        //pilih
        System.out.println("Pilih bangun yang ingin dihitung");
        int pili = input.nextInt();
        //case
        switch (pili) {
            case 1 :
            System.out.println("Data diterima, jenis bangun yang ingin dihitung adalah persegi panjang");
            //masukan lanjang dan lebar
            System.out.println("Masukan Panjang(p)");
            int p = input.nextInt();
            System.out.println("Masukan lebar(l)");
            int l = input.nextInt();
            //hitung luas dan keliling
            System.out.println("keliling : " + 2*(p + l));
            System.out.println("Luas : " + p * l);
                break;
                
            case 2 :
                System.out.println("Data diterima, jenis bangun yang ingin dihitung adalah lingkaran");
                //masukan jari jari 
                final double  pi = 3.14;
                System.out.println("Masukan Jari-jari(r)");
                int r = input.nextInt();
                //hitung luas dan keliling
                System.out.println("Keliling : " + 2 * pi * r);
                System.out.println("Luas : " + pi * Math.pow(r,2));
                break;

            case 3 : 
                System.out.println("Data diterima, jenis bangun yang ingin dihitung adalah segitiga siku siku");
                //masukan alas dan tinggi
                System.out.println("Masukan alas(a)");
                int a = input.nextInt();
                System.out.println("Masukan tinggi(t)");
                int t = input.nextInt();
                //hitung sisi miring
                int x = (a*a)+(t*t);
                double sisiMiring = Math.sqrt(x);
                System.out.println("sisi miring : "+sisiMiring);
                //hitung luas dan keliling
                System.out.printf("%s %3c %.0f\n","Keliling ", ':', (a + t + sisiMiring));
                System.out.printf("%s %7c %d\n", "luas ", ':' ,(a * t)/2);
                break;
            default:
                System.out.println("Data tak ditemukan");
        }
        //penugasan 2
        //masukan berat badan dan tinggi
        
        System.out.println("Masukan berat badan! ");
        int berat = input.nextInt();  
        System.out.println("Masukan Tinggi badan!");
        double tinggi = input.nextDouble();
        //hitung IMT
        double tinggiM = tinggi/100;
        
        //System.out.println(tinggiM);
        double tinggiX = (Math.pow(tinggiM,2));
        
        //System.out.println(Math.round(tinggiX*10)/10.0);
        double imt = berat/tinggiX;
        double imtr = (Math.round(imt*100)/100.0);

        //kondisi
       if(imtr <= 18.5){
        System.out.println("Berat badan  = " + berat);
        System.out.println("Tinggi badan = " + tinggiM);
        System.out.println("IMT          =" + imtr + " Termasuk Kurus ");
       }else if(imtr > 18.5 && imtr <= 25){
        System.out.println("Berat badan  = " + berat);
        System.out.println("Tinggi badan = " + tinggiM);
        System.out.println("IMT          = " + imtr + " Termasuk Normal ");
       }else if(imtr>25 && imtr <= 30){
        System.out.println("Berat badan  = " + berat);
        System.out.println("Tinggi badan = " + tinggiM);
        System.out.println("IMT          = " + imtr + " Termasuk Gemuk ");
       }else if(imtr>30){
        System.out.println("Berat badan  = " + berat);
        System.out.println("Tinggi badan = " + tinggiM);
        System.out.println("IMT          = " + imtr + " Termasuk Kegemukan ");
       }
       
       //Penugasan 3
        
       //masukan jam
       System.out.println(" Masukan jumlah jam kerja dalam seminggu. ");
       int jam = input.nextInt();
       final int upah = 5000;
       final int bonus = 6000;
       final int denda = 1000;
       //penentuan upah

       if(jam >=50 && jam <=60){
           System.out.println("Jam    = "+ jam);
           System.out.println("Upah   = Rp." + jam * upah);
           System.out.println("Lembur = Rp." + 0);
           System.out.println("Denda  = Rp." + 0);
           System.out.println("------------------");
           System.out.println("Total  = Rp." + jam * upah);
       }else if(jam > 60){
           System.out.println("Jam    = "+ jam);
           int x = (jam-60)*upah;
           System.out.println("Upah   = Rp." + (jam*upah-x));
           System.out.println("Lembur = Rp." + (jam-60)*bonus);
           System.out.println("Denda  = Rp." + 0);
           System.out.println("------------------");
           System.out.println("Total   : " + ((jam* upah-x) + ((jam-60)*bonus)));
       }else if(jam <50){
           System.out.println("Jam    = "+ jam);
           System.out.println("Upah   = Rp." + jam * upah);
           System.out.println("Lembur = Rp." + 0);
           System.out.println("Denda  = Rp." + (50-jam)*denda);
           System.out.println("------------------");
           System.out.println("Total   : " + ((jam* upah) - ((50-jam)*denda)));
       }

    }
}
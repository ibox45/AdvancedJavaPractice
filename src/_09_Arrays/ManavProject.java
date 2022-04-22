package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {

    /* TASK :
      Basit bir 5 ürünlü manav alisveris programi yaziniz.

      1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
      2. Adim : Baska bir urun almak isteyip istemedigini sor.
      			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
      			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
      3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
      4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

     */

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari =new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        urunListesi.add("domat  -urun kodu: 1");
        urunListesi.add("muz  -urun kodu: 2");
        urunListesi.add("elma  -urun kodu: 3");
        urunListesi.add("erik  -urun kodu: 4");
        urunListesi.add("cilek  -urun kodu: 5");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);

        System.out.println(urunListesi);
        musteriSecim();

    }

    private static void musteriSecim() {
        System.out.println("sectiniz urun kodu giriniz : ");
        int secim=scan.nextInt();
        System.out.println("sectiginiz urunden kac kilo alacaksiniz : ");
        double kilo= scan.nextDouble();
        double urunTutari=kilo*urunFiyatlari.get(secim-1);
        toplamOdeme+=urunTutari;
        System.out.println("Alisverise devam etmek istiyorsaniz 1 kasa icin 2 seciniz : ");
        int devamMi=scan.nextInt();
        if(devamMi==1){
            musteriSecim();  //recursive method
        }else{
            kasa();
        }


    }

    private static void kasa() {
        System.out.println("yine bekleriz \nodemeniz gereken tutar : "+toplamOdeme);

    }

}

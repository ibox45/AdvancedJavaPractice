package _09_Arrays;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MarketProject {/* TASK :
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 * 			 ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 * 			 ortalama kazançtan aşağıysa o günleri return yap.
 * */
    static List<String> gunler =new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>(); //Kullanıcıdan gelecek data ile atancak bos liste
    static Scanner scan = new Scanner(System.in);
    static double ciro=0;

    public static void main(String[] args) {

        int gun=0;
        while(gun<7){
            System.out.println(gunler.get(gun)+" gununun kazancini giriniz");
            double gunlukHasilat=scan.nextDouble();
            gunlukKazanclar.add(gunlukHasilat);
            ciro+=gunlukHasilat; //hergunun hasilati toplaniyor.
            gun++;
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();
        System.out.println("günlükkazanclar : " + gunlukKazanclar);
        System.out.println("   ***   ");
        System.out.println("ciro  : " + ciro);
        System.out.println("   ***   ");
        System.out.println("haftalik ortalama : " + new DecimalFormat("##.##").format(getOrtalamaKazanc()));
        System.out.println("   ***   ");
        System.out.println("ortalamanin ustu kazanc getiren gun : "+getOrtalamaninUstundeKazancGünleri());
        System.out.println("   ***   ");
        System.out.println("ortalamanin alti kazanc getiren gun : "+getOrtalamaninAltindaKazancGünleri());


    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalamaAltiGun= "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i)<getOrtalamaKazanc()){
                ortalamaAltiGun+=gunler.get(i)+" ";
            }

        }
        return ortalamaAltiGun;

    }

    private static String getOrtalamaninUstundeKazancGünleri() {
        String ortalamaUstuGun= "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
           if (gunlukKazanclar.get(i)>getOrtalamaKazanc()){
               ortalamaUstuGun+=gunler.get(i)+" ";
           }

        }
return ortalamaUstuGun;
    }

    private static double getOrtalamaKazanc() {
        double ortalamaKazanc= ciro/7;
        return ortalamaKazanc;
    }
}

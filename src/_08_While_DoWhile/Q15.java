package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
      */

        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2=scan.nextInt();

        int sayi1Faktoriyel=1;
        int sayi2Faktoriyel=1;
        int farklarininFaktoriyeli=1;
        int farklari=sayi1-sayi2;
        int kombinasyon=1;

        while (farklari>0){
            farklarininFaktoriyeli*=farklari;
            farklari--;
        }

        while (sayi1>0){
            sayi1Faktoriyel*=sayi1;
            sayi1--;
        }

        while (sayi2>0){
            sayi2Faktoriyel*=sayi2;
            sayi2--;
        }
        System.out.println("farklari = " + farklari);
            kombinasyon=sayi1Faktoriyel/(sayi2Faktoriyel*farklarininFaktoriyeli);
        System.out.println("kombinasyon = " + kombinasyon);
        System.out.println("sayi1Faktoriyel = " + sayi1Faktoriyel);
        System.out.println("sayi2Faktoriyel = " + sayi2Faktoriyel);
        System.out.println("farklarininFaktoriyeli = " + farklarininFaktoriyeli);


        // int oldugu için buyuk sayılarda sıkıntı olacak...

    }
}

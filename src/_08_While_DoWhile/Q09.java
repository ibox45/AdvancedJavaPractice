package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        //  Scanner scan=new Scanner(System.in);
        //  System.out.println("pin kodu : ");
        //  int pinKodu=scan.nextInt();
        //  int gecerliPin=7507;
        //  while (pinKodu!=gecerliPin){
        //      System.out.println("gecersiz pin, yeniden deneyin");
        //      pinKodu=scan.nextInt();
//
        //   }
        //   System.out.println("pin kodunuz dogru");


        //do while ile cozum denemesi
        Scanner scan = new Scanner(System.in);
        int gecerliPin = 7507;
        int pinKodu;
        do {
            System.out.println("lutfen pin kodunuzu giriniz");
            pinKodu = scan.nextInt();


        } while (pinKodu!=gecerliPin);
        System.out.println("pin kodu girisi basarili");


    }
}

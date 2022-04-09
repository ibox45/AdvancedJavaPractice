package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int enBuyukSayi=0;
        int sayi;

        while(sayac<5){
            System.out.println("bir sayi girin : ");
            sayi=scan.nextInt();
            if(sayi>enBuyukSayi){
                enBuyukSayi=sayi;
            }
            sayac++;
        }
        System.out.println("en buyuk sayi : "+enBuyukSayi);
    }
}

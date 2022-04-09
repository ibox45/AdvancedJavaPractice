package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.


        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi gir : ");
        int sayi=  scan.nextInt();

        int toplam=0;
        do {
            toplam+=sayi%10;
            sayi/=10;
            System.out.println("toplam = " + toplam);
            System.out.println("sayi = " + sayi);

        }while(sayi>=1);

    }
}

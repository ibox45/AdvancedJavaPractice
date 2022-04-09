package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

         /*   Kullanicidan 2 sayi aliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27
        2  3 = 2*2*2=8
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban ve us giriniz");
        int taban=scan.nextInt();
        int us=scan.nextInt();
        int islem=1;

        for (int i = 1; i <=us ; i++) {

            islem*=taban;
        }
        System.out.println(islem);

        int sonuc=1;
        while (us!=0){
            sonuc*=taban;
            us--;

        }
        System.out.println("sonuc = " + sonuc);
    }
}

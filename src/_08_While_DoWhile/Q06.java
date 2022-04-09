package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


    public static void main(String[] args) {
        /*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("sizden iki sayi istiyorum 1.yi 2.ye böleceğim\n" +
                "1. sayi : ");
        int sayi1=scan.nextInt();
        System.out.println("2.sayi : ");
        int sayi2=scan.nextInt();

        bolmemetodu(sayi1,sayi2);



    }

    private static void bolmemetodu(int sayi1, int sayi2) {

        int bolum=0;
        while (sayi1-sayi2>=0){
            sayi1-=sayi2;
            bolum++;
        }
        System.out.println(bolum);
    }
}

package _07_ForLoop;

import java.util.Scanner;

public class Q06 {

    /*  TASK :
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */

    static Scanner scan=new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("çarpım tablosu axy seklinde olacak a ve b ye siz karar verin");
        System.out.println("a : ");
        int a=scan.nextInt();
        System.out.println("b : ");
        int b=scan.nextInt();
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=b ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }
    }



}

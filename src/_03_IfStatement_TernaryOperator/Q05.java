package _03_IfStatement_TernaryOperator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("yasinizi giriniz: ");
        int yas = scan.nextInt();

        System.out.print("kilonuzu giriniz: ");
        int kilo = scan.nextInt();

        if (yas > 0 && yas < 18) {
            System.out.println("Yasi 18'den kücük olanlar Kan bağışı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("Yaşınız kan bağısı için uygun ancak kilonuz yetersiz");
            } else if (kilo >= 50) {
                System.out.println("Şartlarınız uygun kan bağışı yapabilirsiniz");
            } else {
                System.out.println("kilonuzu hatalı girdiniz");
            }
        } else {
            System.out.println(" hatalı veri  girdiniz");


        }


    }


}

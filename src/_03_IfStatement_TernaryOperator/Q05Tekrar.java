package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05Tekrar {

    /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("yasiniz");
        int yas=scan.nextInt();
        System.out.println("kilonuz");
        int kilo=scan.nextInt();

        if (yas>=18){
            if (kilo>=50){
                System.out.println("kan bagisi yapabilir");
            }else{
                System.out.println("kan bagisi yapamaz");
            }
        }else{
            System.out.println("yasiniz 18'den kucuk oldugu icin kan bagisi yapamazsiniz");
        }

    }
}

package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
         /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz");
        int sayi = scan.nextInt();

        int toplam=0;
        int sayininKlonu=sayi;

        while (sayi>=1){
            toplam+=(sayi%10)*(sayi%10)*(sayi%10);
            sayi/=10;
        }

        if(toplam==sayininKlonu){
            System.out.println("bingo! bir Armstrong sayisi buldunuz");
        }else{
            System.out.println("hayir. girdigininz sayi bir Armstrong sayisi degil");
        }
        System.out.println(sayininKlonu);
        System.out.println(toplam);
    }
}

package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin : ");
        int sayi=scan.nextInt();
        int tekSayilar=0;

        while(tekSayilar<=sayi){
            if(tekSayilar%2==1){
                System.out.print(tekSayilar+"  ");
            }
            tekSayilar++;
        }


    }
}

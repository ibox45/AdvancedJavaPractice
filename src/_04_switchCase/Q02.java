package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("uc basamaklı bir sayi giriniz");
        int sayi=scan.nextInt();
        int birlerBasamagi=sayi%10, onlarBasamagi=(sayi/10)%10, yuzlerBasamagi=(sayi/100)%10;


        if(sayi<100  || sayi>999){
            System.out.println("3 basamaklı bir sayi dedik evladım");
        }else{
            switch(yuzlerBasamagi){
                case 1:System.out.print("yüz ");break;
                case 2:System.out.print("ikiyüz ");break;
                case 3:System.out.print("ucyüz ");break;
                case 4:System.out.print("dortyüz ");break;
                case 5:System.out.print("besyüz ");break;
                case 6:System.out.print("altiyüz ");break;
                case 7:System.out.print("yediyüz ");break;
                case 8:System.out.print("sekizyüz ");break;
                case 9:System.out.print("dokuzyüz ");break;


            }
            switch(onlarBasamagi){
                case 1:System.out.print("on ");break;
                case 2:System.out.print("yirmi ");break;
                case 3:System.out.print("otuz ");break;
                case 4:System.out.print("kirk ");break;
                case 5:System.out.print("elli ");break;
                case 6:System.out.print("altmis ");break;
                case 7:System.out.print("yetmis ");break;
                case 8:System.out.print("seksen ");break;
                case 9:System.out.print("doksan ");break;

            }
            switch (birlerBasamagi)  {
                case 1:System.out.println("bir");break;
                case 2:System.out.println("iki");break;
                case 3:System.out.println("uc");break;
                case 4:System.out.println("dort");break;
                case 5:System.out.println("bes");break;
                case 6:System.out.println("alti");break;
                case 7:System.out.println("yedi");break;
                case 8:System.out.println("sekiz");break;
                case 9:System.out.println("dokuz");break;

            }

        }



    }
}

package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Cevirim yapacagınız islemi seciniz\n" +
                "Saati saniyeye cevirmek icin : 1\n" +
                "Mil'i kilometereye cevirmek icin : 2\n" +
                "Kilogrami grama cevirmek icin : 3\n" +
                "giriniz");
        int islem=scan.nextInt();
        System.out.println("Cevirim miktarını giriniz");
        double miktar=scan.nextDouble();

        donustur(islem,miktar);
    }

    private static void donustur(int islem, double miktar) {

        switch (islem){
            case 1:
                System.out.println(miktar+" saat "+(miktar*60*60)+" saniyedir.");
                break;
            case 2:
                System.out.println(miktar+ " mil "+(miktar*1.609344)+ " kilometredir.");
                break;
            case 3:
                System.out.println(miktar+ " kilogram "+(miktar*1000)+ " gramdir.");
                break;
            default:
                System.out.println("benim adım hıdır, elimden gelen budur.\n" +
                        "Biraz da sen mi yardımcı olsan!");

        }
    }
}


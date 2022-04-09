package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf girin");
        String str=scan.next();

        String sesliHarfler="AEIOUaeiou";

        if (str.length()==1) {

            if ((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')) {

                if (sesliHarfler.contains(str.substring(0, 1))) {
                    System.out.println("sesli harf");
                } else {
                    System.out.println("sessiz harf");
                }


            }else{
                System.out.println("yanlis karakter");

            }



        }else{
            System.out.println("1 karakterden fazla girdiniz");
        }



    }

}



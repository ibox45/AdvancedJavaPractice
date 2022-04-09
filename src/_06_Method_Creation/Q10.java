package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */
    public static void main(String[] args) {

        int sayi=81;

        System.out.println(ucUssuKontrol(sayi));
    }

    private static boolean ucUssuKontrol(int sayi) {

        boolean sonuc=false;
        int kontrolSayisi=1;
        while(kontrolSayisi<sayi){
            kontrolSayisi*=3;
            if (kontrolSayisi == sayi) {
                sonuc = true;
                break;
            }

        }
        return sonuc;
    }




}

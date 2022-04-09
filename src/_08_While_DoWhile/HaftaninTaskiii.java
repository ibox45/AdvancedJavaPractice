package _08_While_DoWhile;

import java.util.Scanner;

public class HaftaninTaskiii {

    public static void main(String[] args) {

        /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */


        Scanner scan=new Scanner(System.in);
        System.out.println("topun ilk bırakıldıgı yukseklıgı : ");
        double yukseklik=scan.nextDouble();

        double toplamYol=0;
        int ziplamaSayisi=0;

    //  while (yukseklik>=1){
    //      toplamYol+=yukseklik+(0.75*yukseklik);
    //              yukseklik=(0.75*yukseklik);
    //              ziplamaSayisi++;

    //  }
    //  System.out.println(toplamYol);
    //  System.out.println(ziplamaSayisi);

        do {toplamYol+=yukseklik+(0.75*yukseklik);
                         yukseklik=(0.75*yukseklik);
                       ziplamaSayisi++;



        }while (yukseklik>=1);
        System.out.println(toplamYol);
        System.out.println(ziplamaSayisi);





    }
}

package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("vize notunuzu yazınız");
        double vizeNotu=scan.nextDouble();
        System.out.println("final notunuzu yazınız");
        double finalNotu=scan.nextDouble();
        System.out.println("vize notunun yüzde oranını yazınız");
        double vizeOran=scan.nextDouble();
        System.out.println("final notunun yüzde oranını  yazınız");
        double finalOran=scan.nextDouble();
        double ortalama=(vizeNotu*(vizeOran/100))+(finalNotu*(finalOran/100));

        if (vizeNotu>=0 && vizeNotu<=100  &&  finalNotu>=0 &&  finalNotu<=100 && vizeOran>=0 &&vizeOran<=100  && finalOran==100-vizeOran){
            if(ortalama>=50){
                System.out.println("Ortalamanız : "+ortalama+"\nTebrikler dersi başarı ile geçtiniz...");
            }else{System.out.println("Ortalamanız : "+ortalama+"\nMalesef dersten kaldınız...");

            }



        }else{
            System.out.println("girdiginiz verileri kontrol edin");
        }




    }
}

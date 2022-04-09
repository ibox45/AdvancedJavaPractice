package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("ad soyad yaz");
        String adSoyad=scan.nextLine();

        String ad1=adSoyad.charAt(0)+".";
        String ad2=adSoyad.charAt(adSoyad.indexOf(" ")+1)+".";
        String soyad=adSoyad.charAt(adSoyad.lastIndexOf(" ")+1)+".";
        System.out.println(ad1.concat(ad2.concat(soyad)));



    }
}

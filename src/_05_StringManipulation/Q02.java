package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("ad soyad yaz");
        String adSoyad=scan.nextLine();

        String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);






    }
}

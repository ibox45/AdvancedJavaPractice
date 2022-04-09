package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("üç adet sayı girin ben de size girdiginiz sayılardan bir dik ucgen olur mu onu soyleyeyim");
        System.out.println("birinci kenarı giriniz : ");
        double a = scan.nextDouble();
        System.out.println("ikinci kenarı giriniz : ");
        double b = scan.nextDouble();
        System.out.println("ucuncu kenarı giriniz : ");
        double c = scan.nextDouble();
        if (a > 0 && b > 0 && c > 0){
             if ((a * a) + (b * b) == (c * c)) {
                System.out.println("Bu bir dik üçgendir");
            }else if ((b * b) + (c * c) == (a * a)) {
                System.out.println("Bu bir dik üçgendir");
            }else if ((a * a) + (c * c) == (b * b)) {
                System.out.println("Bu bir dik üçgendir");
            } else {
                System.out.println("bu bir dik ucgen degıldır.");
            }


        }else {
            System.out.println("hatalı giris");
        }
    }
}

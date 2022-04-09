package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ehliyetiniz var ise ->1 yok ise ->0 yazınız: ");
        int ehliyetiniz = scanner.nextInt();
        if (ehliyetiniz == 0 || ehliyetiniz == 1) {
            if (ehliyetiniz == 0) {
                System.out.println("hızınızı sormadan kafadan bir 200 kitledim");
            }

            System.out.println("hızınızı giriniz");
            int hiziniz = scanner.nextInt();

            if (ehliyetiniz == 1) {
                if (hiziniz < 0) {
                    System.out.println("negatif hız olamaz");
                } else if (hiziniz >= 55 && hiziniz < 75) {
                    System.out.println("Ceza 100 dolar");
                } else if (hiziniz >= 75 && hiziniz < 85) {
                    System.out.println("Ceza 150 dolar");
                } else if (hiziniz >= 85 && hiziniz < 95) {
                    System.out.println("Ceza 320 dolar");
                } else if (hiziniz >= 95) {
                    System.out.println("Ceza 500 dolar");
                } else {
                    System.out.println("ihlal yok, hayırlı yolculuklar");
                }
            } else if (ehliyetiniz == 0) {
                if (hiziniz < 0) {
                    System.out.println("negatif hız olamaz");
                } else if (hiziniz >= 55 && hiziniz < 75) {
                    System.out.println("Ceza 300 dolar");
                } else if (hiziniz >= 75 && hiziniz < 85) {
                    System.out.println("Ceza 350 dolar");
                } else if (hiziniz >= 85 && hiziniz < 95) {
                    System.out.println("Ceza 520 dolar");
                } else if (hiziniz >= 95) {
                    System.out.println("Ceza 700 dolar");
                } else {
                    System.out.println("hız tamam da ehliyetin yok be abi 200 dolar ceza");
                }

            }

        }else{
            System.out.println("dostum ehliyetin var mı yok mu ");}

    }
}




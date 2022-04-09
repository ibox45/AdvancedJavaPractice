package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10Tekrar {
    public static void main(String[] args) {

         /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
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

        //Eğer hızınız 55-74 arasında ise:
        int ceza1= 100;

        //Eğer hızınız 75 - 84 arasında ise:
        int ceza2= 150;

        //Eğer hızınız 85 -94 arasında ise:
        int ceza3= 320;

        //Eğer hızınız 94'den daha fazla ise:
        int ceza4= 500;

        //Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir
        int ehliyetCezasi=200;


        Scanner scan=new Scanner(System.in);
        System.out.println("Aracınızın hızı?");
        int hiz=scan.nextInt();
        System.out.println("Ehliyetiniz var ise 1\nyok ise 0 tuslayın");
        int ehliyet=scan.nextInt();

        if(ehliyet==1){
            if(hiz<=0){
                System.out.println("gecerli bir hız bilgisi giriniz");
            }
            else if(hiz>=55 && hiz<75){
                System.out.println("hız sınırından dolayı " +ceza1+ " $ ceza ödemelisiniz");
            }else if(hiz>=75 && hiz<85){
                System.out.println("hız sınırından dolayı " +ceza2+ " $ ceza ödemelisiniz");
            }else if (hiz>=85 && hiz<95){
                System.out.println("hız sınırından dolayı " +ceza3+ " $ ceza ödemelisiniz");
            }else if (hiz>=95){
                System.out.println("hız sınırından dolayı " +ceza4+ " $ ceza ödemelisiniz");
            }else{
                System.out.println("hayırlı yolculuklar");
            }
        }else if(ehliyet==0) {
            if(hiz<=0){
                System.out.println("gecerli bir hız bilgisi giriniz");
            }
            else if (hiz >= 55 && hiz < 75) {
                System.out.println("hız sınırı ve ehliyetiniz olmadıgı icin " + (ceza1 + ehliyetCezasi) + " $ ceza ödemelisiniz");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("hız sınırı ve ehliyetiniz olmadıgı icin " + (ceza2 + ehliyetCezasi) + " $ ceza ödemelisiniz");
            } else if (hiz >= 85 && hiz < 95) {
                System.out.println("hız sınırı ve ehliyetiniz olmadıgı icin " + (ceza3 + ehliyetCezasi) + " $ ceza ödemelisiniz");
            } else if (hiz >= 95) {
                System.out.println("hız sınırı ve ehliyetiniz olmadıgı icin " + (ceza4 + ehliyetCezasi) + " $ ceza ödemelisiniz");

            }else{
                System.out.println("hız ihlali yok ancak ehliyetiniz olmadıgı için " + ehliyetCezasi + " $ ceza ödemelisiniz");
            }
        }else{
            System.out.println("ehliye bilgisini yanlıs girdiniz");
        }





    }
}

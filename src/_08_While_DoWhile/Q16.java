package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("pin giriniz");
        String pin= scan.nextLine();
        String sistemPin="ibox45";
         int sayac=1;

         while (sayac<4){

             if(sayac==3){
                 System.out.println("3 hakkiniz vardi");
                 break;
             }
             if(!sistemPin.equals(pin)){
                 System.out.println("yanlıs pin tekrar deneyin");
                 pin= scan.nextLine();
                 sayac++;}
                 if(sistemPin.equals(pin)){
                     System.out.println("basari ile giris yapildi");
                     break;
                 }

             }
      //  Scanner scan = new Scanner(System.in);
        String systemPin = "javacanlara selam olsun";

        int girisHakki = 3;

        while (true) {
            System.out.print("pin code  giriniz : ");
            String userPin = scan.nextLine();
            if (userPin.equals(systemPin)) {
                System.out.println("gayet basarili");
                break;
            } else {
                System.out.println("hatali giris yapildi");
                girisHakki--;
                System.out.println("kalan deneme hakkiniz : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("agam hakkin kalmadi bekleme yapma dewamkeee :)");
                    break;
                }
            }

        }


        // while(true) sonsuz döngü olusturmak ıcın kullanılabılır. gerceklesen durum oldugunda dongunun kırılması ıcın
        //break; ıfadesı kullanılmalıdır.

         }
    }


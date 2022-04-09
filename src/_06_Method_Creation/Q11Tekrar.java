package _06_Method_Creation;

import java.util.Scanner;

public class Q11Tekrar {

    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4");

        secim1();



    }

    private static void secim1() {
        System.out.println("yapacagınız islemi seciniz : ");
        int secim=scan.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorgulama1();
                break;
            case 2:
                paraCekme1();
                break;
            case 3:paraYatirma1();
            case 4: cikis1();
            break;


        }
    }

    private static void paraYatirma1() {
        System.out.println("ne kadar yatıracaksiniz");
        int yatirilacakMiktar=scan.nextInt();
        bakiye+=yatirilacakMiktar;
        System.out.println("isleminiz gerceklesti");

        System.out.println("    ********      ");
        System.out.println("isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz");
        int karar=scan.nextInt();
        if(karar==1){
            secim1();
        }else cikis1();



    }

    private static void paraCekme1() {
        System.out.println("cekeceginiz miktari girin");
        int cekilecekMiktar=scan.nextInt();
        if(cekilecekMiktar>bakiye){
            System.out.println("bakiyeniz yetersiz");

        }else{
            bakiye-=cekilecekMiktar;
            System.out.println("Cekme islemininz gerceklestirilmistir.");
        }
        System.out.println("    ********      ");
        System.out.println("isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz");
        int karar=scan.nextInt();
        if(karar==1){
            secim1();
        }else cikis1();

    }

    private static void bakiyeSorgulama1() {
        System.out.println("bakiyeniz : "+bakiye);
        System.out.println("    ********      ");
        System.out.println("isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz");
        int karar=scan.nextInt();
        if(karar==1){
            secim1();
        }else cikis1();

    }

    private static void cikis1() {
        System.out.println("Cikisiniz yapildi yine bekleriz");
    }
}

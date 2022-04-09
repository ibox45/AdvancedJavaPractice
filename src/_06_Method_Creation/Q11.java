package _06_Method_Creation;

import java.util.Scanner;

public class Q11 {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */
        System.out.println("   ****    ");
        System.out.println("ATM'ye hosgeldiniz");
        System.out.println("bakiye sorgulama: 1\nPara cekme : 2\nPara yatirma : 3\ncikis : 4");

        secim();


    }

    private static void secim() {
        System.out.println("yapacaginiz işlemi seciniz : ");
        int secim=scan.nextInt();
        switch (secim) {
            case 1: bakiyeSorgulama();
            break;
            case 2:paraCek();
            break;
            case 3:paraYatir();
            break;
            case 4: cikis();
        }

    }

    private static void paraYatir() {
        System.out.println("ne kadar yatırmak istiyorsun");
        int yatirilacakPara=scan.nextInt();
        bakiye+=yatirilacakPara;
        System.out.println("Para yatırılmıştır.");
        System.out.println("  ***   ");
        System.out.println("isleme devam etmek istiyorsaniz 1\n işleme devam etmek istemiyorsanız 0\n tuslayiniz");

        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();
    }

    private static void paraCek() {
        System.out.println("ne kadar istiyorsun");
        int cekilecekMiktar=scan.nextInt();
        if (cekilecekMiktar>bakiye){
            System.out.println("bakiye yetersiz");
        }else {
            bakiye-=cekilecekMiktar;
            System.out.println("çekme işleminiz tamamlanmıştır");
        }
        System.out.println("  ***   ");
        System.out.println("isleme devam etmek istiyorsaniz 1\n işleme devam etmek istemiyorsanız 0\n tuslayiniz");

        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();
    }

    private static void bakiyeSorgulama() {
        System.out.println("bakiyeniz : "+bakiye);
        System.out.println("  ***   ");
        System.out.println("isleme devam etmek istiyorsaniz 1\n işleme devam etmek istemiyorsanız 0\n tuslayiniz");

        int karar=scan.nextInt();
        if (karar==1){
        secim();
        }else cikis();
    }

    private static void cikis() {
        System.out.println("yine bekleriz,Selametle");
    }



}




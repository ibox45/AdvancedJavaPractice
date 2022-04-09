package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        Scanner scan=new Scanner(System.in);
        System.out.println("gününü söyle 100 gün sonraki gününü söyleyeyim");
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
        "6\nPazar: 7\nHaftanın kaçıncı gününde olduğunu giriniz : ");
        int kacinciGun=scan.nextInt();

        if(kacinciGun<=0 || kacinciGun>7){
            System.out.println("hatalı veri girdiniz");
        }else{
            System.out.println("kac gun sonrasını ogrenmek ıstıyorsunuz");
            int kacGunSonrasi=scan.nextInt();
            int bulunanGun=(kacinciGun+kacGunSonrasi)%7;
            switch(bulunanGun){
                case 1:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden "+"pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden "+"sali");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden "+"carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden "+"persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden "+"cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden "+"cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden "+"pazar");
                    break;
            }
        }




        }


    }



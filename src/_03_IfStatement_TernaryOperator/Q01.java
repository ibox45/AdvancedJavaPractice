package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);  // kullanıcıdan input olmak için scanner obje create ettik.
        System.out.println("toplama icin 1\nçıkarma için 2\nbölme için 3\nçarpma için 4");
        //kullanıcıya işlem seçtiriyoruz burada. \n metni bi aşağı satıra alır.
        int islem = scan.nextInt();
        System.out.println("lütfen iki tam sayı giriniz:");  //kullanıcıya bildirimde bulunuld

        double num1 = scan.nextDouble();  //1. sayı assign edildi.
        double num2 = scan.nextDouble();  //2. sayı assign edildi.

        if(islem==1) {
            System.out.println("toplama işleminin sonucu:"+num1+ "+"+num2+"="+(num1+num2));
        } else if (islem==2) {
            System.out.println("çıkarma işleminin sonucu:"+num1+ "-"+num2+"="+(num1-num2));
        } else if (islem==3) {
            System.out.println("bölme işleminin sonucu:"+num1+ "/"+num2+"="+(num1/num2));
        }else if (islem==4) {
            System.out.println("çarpma işleminin sonucu:"+num1+ "x"+num2+"="+(num1*num2));
        } else {System.out.println("hatalı seçim yaptnız tekrar deneyiniz");}





    }

}

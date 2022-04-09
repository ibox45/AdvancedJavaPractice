package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01Tekrar {
    /* TASK :
     * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
     *  dort islemden biri ile isleme koyup sonucun yazdiriniz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz\nilk sayi : ");
        double sayi1=scan.nextDouble();
        System.out.println("ikinci sayi : ");
        double sayi2=scan.nextDouble();
        System.out.println("işlemi seciniz +-*/");
        String islem=scan.next();

        if(islem.equals("+")){
            System.out.println(sayi1+sayi2);
        }else if(islem.equals("-")){
            System.out.println(sayi1-sayi2);
        }else if(islem.equals("*")){
            System.out.println(sayi1*sayi2);
        }else if(islem.equals("/")){
            System.out.println(sayi1/sayi2);
        }else{
            System.out.println("seciminizi kontrol edin");
        }





    }
}

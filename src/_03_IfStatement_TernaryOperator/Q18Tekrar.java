package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q18Tekrar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Vize sınav sonucunuzu giriniz :");
        double vizeNotu=scan.nextDouble();
        System.out.println("Vize sınavı yüzdesini giriniz");
        double vizeYuzdesi=scan.nextDouble();
        System.out.println("Final sınav sonucunuzu giriniz");
        double finalNotu=scan.nextDouble();
        System.out.println("Final sınavı yüzdesini giriniz");
        double finalYuzdesi=scan.nextDouble();
        double ortalama=(vizeNotu*(vizeYuzdesi/100))+(finalNotu*(finalYuzdesi/100));

        if(ortalama>=90 && ortalama<=100){
            System.out.println("harf notu AA");
        }else if (ortalama>=80){
            System.out.println("harf notu BA");
        }else if(ortalama>=70){
            System.out.println("harf notu BB");
        }else if(ortalama>=60) {
            System.out.println("harf notu CB");
        }else if(ortalama>=50) {
            System.out.println("harf notu CC");
        }else if(ortalama>=40) {
            System.out.println("harf notu DC");
        }else if(ortalama>=30) {
            System.out.println("harf notu DD");
        }else if(ortalama<30 && ortalama>=0) {
            System.out.println("harf notu FF");
        }else {
            System.out.println("hatalı giris");
        }


    }
}

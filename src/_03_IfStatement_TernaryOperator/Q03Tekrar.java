package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03Tekrar {
    /* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30>BMI ==> Obez grubundasiniz.

		 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu (cm) olarak giriniz");
        double boy=scan.nextDouble();
        System.out.println("kilonuzu (kg) olarak giriniz");
        double kilo=scan.nextDouble();

        double bmi=kilo/((boy/100)*(boy/100));
        System.out.println("kütle vücut endeksiniz : " + bmi);

        if(bmi<=20){
            System.out.println("oldukca zayifsiniz");
        }else if(bmi>20 && bmi<=25){
            System.out.println("normal sinirlardasiniz");
        }else if(bmi<=30){
            System.out.println("sisman kategorisindesiniz");
        }else if(bmi>30){
            System.out.println("obez grubundasiniz");
        }else{
            System.out.println("bir yanlışlık olmalı");
        }


    }
}

package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */


        Scanner scan=new Scanner(System.in);

        System.out.println("Boyunuzu cm giriniz:");
        double boy=scan.nextDouble();

        System.out.println("Kilonuzu kg giriniz:");
        double kilo=scan.nextDouble();

        double bmi=kilo/((boy/100)*(boy/100));
        System.out.println(bmi);


        if (bmi<=20){
            System.out.println("oldukça zayıfsınız");
        } else if (bmi<=25){
            System.out.println("Normal sınırlardasınız");
        } else if (bmi<=30){
            System.out.println("şişman kategorisindesiniz");
        } else if (bmi>30){
            System.out.println("obez gurubundasınız");
        }




    }

}

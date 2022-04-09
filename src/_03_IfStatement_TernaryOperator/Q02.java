package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */

		Scanner scan=new Scanner(System.in);
		System.out.println("üç tane pozitif tam sayı giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();

		if (a==b  && a==c){
			System.out.println("es kenar ucgen");
		}else if ((a+c>b  && a-c<b) && (a+b>c && a-b<c) && (b+c>a  && b-c<a)){
			System.out.println("ucgen olma kosulunu saglıyor");
		}else{
			System.out.println("ucgen olma kosulunu saglamıyor");
		}



	}

}

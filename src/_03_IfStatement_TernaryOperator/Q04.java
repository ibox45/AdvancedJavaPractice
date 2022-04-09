package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("mesleginizi qa/dev/ba/pm olarak seciniz");
		String meslek=scan.next().toLowerCase();

		if(meslek.equals("qa")){
			System.out.println("Quality Analyst");
		}else if(meslek.equals("dev")) {
			System.out.println("Developer");
		}else if(meslek.equals("ba")) {
			System.out.println("Busines Analyst");
		}else if(meslek.equals("pm")) {
			System.out.println("Project Manager");
		}else {
			System.out.println("yanlıs secim yaptiniz");
		}


	}

}

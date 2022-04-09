package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TASK:
		// Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.

		Scanner scan=new Scanner(System.in);
		System.out.println("yil giriniz");
		int yil=scan.nextInt();


		if(yil%4==0){
			System.out.println("yıl artık yıldır.");
		}else{
			System.out.println("artık yıl degıldır.");
		}

	}

}

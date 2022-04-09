package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, 10 urunden az
	 * alirsa  %15 indirim yapin
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("aldıgınız ürün adedi");
		double adet=scan.nextDouble();
		System.out.println("liste fiyatı");
		double listeFiyati=scan.nextDouble();
		System.out.println("Musteri kartiniz var ise 1\nyok ise 0 tuslayınız");
		double musteriKarti=scan.nextDouble();

		if(musteriKarti==1){
			if(adet>=10){
				System.out.println(adet*listeFiyati*80/100);
			}else if(adet>0 && adet<10){
				System.out.println(adet*listeFiyati*85/100);
			}else{
				System.out.println("adet girisini kontrol ediniz");
			}

		}else if(musteriKarti==0){
			if(adet>=10){
				System.out.println(adet*listeFiyati*85/100);
			}else if(adet>0 && adet<10){
				System.out.println(adet*listeFiyati*90/100);
			}else{
				System.out.println("adet girisini kontrol ediniz");
			}
		}else {
			System.out.println("musteri karti bilginizi dogru tuslayiniz");
		}









	}

}

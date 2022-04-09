package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        Scanner scan=new Scanner(System.in);
       System.out.print("adınız : ");
       String isim=scan.next();
       System.out.print("soyadınız : ");
       String soyIsim=scan.next();
       System.out.print("kredi kart no : ");
       String kartNo=scan.next();




        if(kartNo.length()==16){
            String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
            String yeniSoyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
            String yeniKartNo=kartNo.substring(0,kartNo.length()-4).replaceAll("\\w","*")+kartNo.substring(kartNo.length()-4);
            System.out.println("Ad : "+yeniIsim+"\nSoyad : "+yeniSoyIsim+"\nKart No : "+yeniKartNo);

        }else{
            System.out.println("Geçersiz kredi kartı numarası");
        }












    }
}

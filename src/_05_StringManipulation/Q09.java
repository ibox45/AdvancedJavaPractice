package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime yaz");
        String kelime=scan.nextLine();

        if(kelime.length()%2==0){
            System.out.println(kelime.substring(0,kelime.length()/2));

        }else{
            System.out.println(kelime + "kelimesinin karakter sayısı çift degildir.");
        }

    }
}

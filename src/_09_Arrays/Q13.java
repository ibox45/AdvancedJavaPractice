package _09_Arrays;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
          /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("8 elemanli bir array olusturacagiz.");
        int [] arr=new int[8];
        int sayac=0;

        for (int i = 0; i < 8; i++) {
            System.out.print(i+1+". elemani giriniz : ");
            arr[i]=scan.nextInt();
            if(arr[i]%3==0){
                sayac++;


            }

        }

        System.out.println("Kullanicidan aldigimiz 8 elemanli arrayin icinde\n" +
                "3 e bolunebilen sayi adedi : "+sayac);
    }
}

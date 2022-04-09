package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

         /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.
            Not: sqrt gibi fonksiyonları  kullanmayın.
            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16
            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25
            Example 3:
            Input: 14
            Output: false
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin : ");
        int sayi=scan.nextInt();
        int count = 0;
        boolean a = false;

        while (count * count <= sayi) {
            if (count * count == sayi) {
                a = true;
                break;
            }
            count++;
        }

        System.out.println(a);


    }
}

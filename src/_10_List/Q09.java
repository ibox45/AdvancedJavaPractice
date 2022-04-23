package _10_List;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {

     /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)
         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz : ");
        String cumle = scan.nextLine().toLowerCase();

        String[] cumleArr = cumle.split("");
        System.out.println(Arrays.toString(cumleArr));  //[L, e, a, r, n, i, n, g,  , j, a, v, a,  , i, s,  , e, a, s, y]

        String enCokTekrarEden = "";
        int maxSayac = 0;
        int sayac = 0;

        for (int i = 0; i < cumleArr.length; i++) {
            for (int j = 0; j < cumleArr.length; j++) {
                if (cumleArr[i].equals(cumleArr[j])) {
                    sayac++;

                }


            }


            if (sayac > maxSayac) {
                maxSayac = sayac;
                enCokTekrarEden = cumleArr[i];


            }
            sayac = 0;

        }
        System.out.println("en cok tekrar eden harf : " + enCokTekrarEden + "\ntekrar sayisi : " + maxSayac);

    }}


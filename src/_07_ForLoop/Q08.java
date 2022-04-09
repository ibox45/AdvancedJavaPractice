package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */



        Scanner scan=new Scanner(System.in);
        System.out.println("bir string gir : ");
        String str=scan.nextLine().toLowerCase();

        String terstenStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            terstenStr+=str.charAt(i);


        }
        if(terstenStr.equals(str)){
            System.out.println("evet bir palindrome ile karsi karsiyayiz");
        }else{
            System.out.println("hayir bir palindrome degil, normal alalade bir cumle:)");
        }




    }

}


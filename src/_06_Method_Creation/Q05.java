package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string gir : ");
        String str=scan.nextLine();

        kacKelimeVar(str);




    }

    private static void kacKelimeVar(String str) {

        String yeniStr=str.replace(" ","");
        System.out.println(str.length()-yeniStr.length()+1);
    }
}

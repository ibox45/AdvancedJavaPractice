package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("bir string gir : ");
        String str=scan.nextLine();


        System.out.println(xyzMethod(str));
        System.out.println(str.contains("xyz"));  // methodsuz bir satır :)


    }

    private static boolean xyzMethod(String str) {

        return str.contains("xyz");

    }

}

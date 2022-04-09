package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
       */


        Scanner scan=new Scanner(System.in);
        System.out.println("bir harfe basınca program bitti yazıyor acaba hangisi :)");
        String str;

        do {
            str=scan.next();
            if(str.equals("x"))
                break;
            System.out.println("Program calisiyor");

        }while(!str.equals("x"));
        {
            System.out.println("Program bitti");
        }
    }
}

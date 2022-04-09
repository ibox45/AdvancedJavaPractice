package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String  str = scan.nextLine();
        String str2="";
        for (int i = 1; i <str.length() ; i=i+2) {
            str2+=str.charAt(i);

        }
        System.out.println(str2);


    //  Scanner scan = new Scanner(System.in);
    //  System.out.print("bir metin giriniz : ");
    //  String  str = scan.nextLine();
    //  int index=0;
    //  do {
    //      if (index%2==1){
    //          System.out.print(str.charAt(index)+" ");
    //      }
    //      index++;
    //  }while(index<str.length());
    }
}

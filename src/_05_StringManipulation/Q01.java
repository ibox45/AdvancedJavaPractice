package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("bir String yazın");
        String str=scan.nextLine();

       boolean boslukVarMi= str.contains(" ");
       if(boslukVarMi==true){
           System.out.println("bosluk var");
       }else{
           System.out.println("bosluk yok");
       }




    }
}


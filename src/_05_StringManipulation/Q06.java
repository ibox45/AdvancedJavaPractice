package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir e-posta adresi girin");
        String ePosta=scan.next();

        //String yeniePosta=ePosta.replace("hotmail","gmail");
        //System.out.println(yeniePosta);

        String str1=ePosta.substring(ePosta.indexOf("@")+1);
        if(str1.contains("hotmail")){
        String yeniePosta=ePosta.replace("hotmail","gmail");
            System.out.println(yeniePosta);
        }else{
            System.out.println(ePosta);
        }


    }
}

package _08_While_DoWhile;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("3 harfli bir isim giriniz");
        String isim=scan.next().toLowerCase();

        if(isim.length()==3){
            if(isim.charAt(0)==isim.charAt(1)  || isim.charAt(0)==isim.charAt(2) || isim.charAt(1)==isim.charAt(2)){
                System.out.println("isim ayni karakterlere sahiptir.");
            }else{
                System.out.println("Dizenin benzersiz karakterleri var");
            }


        }else{
            System.out.println("3 harfli olmalidir");
        }

    }
}

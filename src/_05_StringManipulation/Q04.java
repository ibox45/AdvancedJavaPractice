package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime yaz");
        String kelime=scan.nextLine().toLowerCase();

        String tersten=""+kelime.toUpperCase().charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0);
        System.out.println(tersten);






    }
}

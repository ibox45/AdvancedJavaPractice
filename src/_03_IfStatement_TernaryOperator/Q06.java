package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinatnın hangi bölgede
        // olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y değerlerinizi giriniz");

        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("girdiginiz değerler 1. bölgeye ait");
        } else if (x < 0 && y > 0) {
            System.out.println("girdiginiz değerler 2. bölgeye ait");
        } else if (x < 0 && y < 0) {
            System.out.println("girdiginiz değerler 3. bölgeye ait");
        } else if (x > 0 && y < 0) {
            System.out.println("girdiginiz değerler 4. bölgeye ait");
        } else if (x == 0 && y != 0) {
            System.out.println("girdiginiz değerler y ekseni üzerinde");
        } else if (x != 0 ) {
            System.out.println("girdiginiz değerler x ekseni üzerinde");
        } else {
            System.out.println("girdiğiniz değerler orjindedir");
        }
    }
}
package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("yılın kacıncı ayını öğrenmek istiyorsunuz : ");
        int ay=scan.nextInt();


        switch(ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiginiz ayda 31 gün vardır.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("girdiginiz ayda 30 gün vardır.");
                break;
            case 2:
                System.out.println("hangi yıl icin sordunuz");
                int yil=scan.nextInt();
                if(yil%4==0){
                    System.out.println("girdiginiz ayda 29 gün vardır.");
                }else{
                    System.out.println("girdiginiz ayda 28 gün vardır.");
                }
                break;
                default:
                {
                    System.out.println("bir yılda 12 ay vardır, bu bilgiyi goz onunde bulundurmalısınız");
                }


        }




    }
}


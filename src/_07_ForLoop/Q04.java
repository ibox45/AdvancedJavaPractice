package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan=new Scanner(System.in);
       // System.out.println("5 adet sayi giriniz");
     //  int sayi1=scan.nextInt();
     //  int sayi2=scan.nextInt();
     //  int sayi3=scan.nextInt();
     //  int sayi4=scan.nextInt();
     //  int sayi5=scan.nextInt();

     //  int toplam=0;

     //  if(!(sayi1>=5 && sayi1<=10)){
     //      toplam+=sayi1;

     //  }if(!(sayi2>=5 && sayi2<=10)){
     //      toplam+=sayi2;
     //  }
     //  if(!(sayi3>=5 && sayi3<=10)){
     //      toplam+=sayi3;
     //  }
     //  if(!(sayi4>=5 && sayi4<=10)){
     //      toplam+=sayi4;
     //  }
     //  if(!(sayi5>=5 && sayi5<=10)){
     //      toplam+=sayi5;
     //  }
     //  System.out.println(toplam);

        int toplam=0;

        for (int i = 1; i <=5; i++) {
            System.out.println("5 tane sayi gireceksiniz. simdi bir sayi girin");
            int sayi=scan.nextInt();
            if((sayi>5 && sayi<10)){
                System.out.println("girdiğiniz sayı 5 ile 10 arası olduğundan isleme girmeyecek");
            }else{
                toplam+=sayi;
            }

        }
        System.out.println("girdiginiz sayilarin toplamı :" + toplam);


    }

}

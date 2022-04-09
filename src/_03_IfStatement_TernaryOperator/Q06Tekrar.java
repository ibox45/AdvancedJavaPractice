package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06Tekrar {
    //TASK :  Kullanıcıdan aldığınız koordinatnın hangi bölgede
    // olduğunu yazdıran bir kod yazınız.


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("x ve y degerlerini giriniz");
        int x=scan.nextInt();
        int y=scan.nextInt();

        if(x>0 && y>0){
            System.out.println("1. bölge");
        }else if(x<0 && y>0){
            System.out.println("2. bölge");
        }else if(x<0 && y<0){
            System.out.println("3.bölge");
        }else if(x>0 && y<0){
            System.out.println("4. bölge");
        }else if(x!=0 && y==0){
            System.out.println("x ekseni üzerinde");
        }else if(x==0 && y!=0){
            System.out.println("y ekseni üzerinde");
        }else{
            System.out.println("orjindedir");
        }
    }


}

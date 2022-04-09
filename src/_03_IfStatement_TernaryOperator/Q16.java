package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("3 tane sayi giriniz");
        int num1 =scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println(num1+ " en büyük sayidir");
            if(num2>=num3){
                System.out.println(num3+ " en küçük sayidir");
            }else {
                System.out.println(num2+ " en küçük sayidir");
            }
        } else if(num2>=num1 && num2>=num3){
            System.out.println(num2+ " en büyük sayidir");
            if(num1>=num3){
                System.out.println(num3+ " en küçük sayidir");
            }else {
                System.out.println(num1+ " en küçük sayidir");
            }
        } else {if(num3>=num2 && num3>=num1)
            System.out.println(num3+ " en büyük sayidir");
            if(num1>=num2){
                System.out.println(num2+ " en küçük sayidir");
            }else {
                System.out.println(num1+ " en küçük sayidir");
            }
        }


        
    }
}


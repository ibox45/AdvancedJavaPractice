package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kac elemanlı bir Array olsun : ");
        int arrBoyutu=scan.nextInt();
        int[] arr=new int[arrBoyutu];

        for (int i = 0; i < arrBoyutu; i++) {
            System.out.println(i+1+". eleman: ");
            arr[i]=scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("en büyük ile en kücük elemanin farki : "+(arr[arr.length-1])+"-"+(arr[0])+"="+((arr[arr.length-1])-arr[0]));



    }
}

package _09_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {

        /*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

	*/


        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        Arrays.sort(arr);
        System.out.println("dizideki en buyuk sayi : " + arr[arr.length - 1]);
        System.out.println("dizideki en kucuk sayi : " + arr[0]);
        System.out.println("dizideki en buyuk ikinci sayi : " + arr[arr.length - 2]);

        //2.yol

        int min1 = 0;
        int max1 = 0;
        int ikincimax1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            } else if (arr[i] > ikincimax1 && arr[i] < max1) {
                ikincimax1 = arr[i];

            }
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(min1);
        System.out.println(ikincimax1);
    }
}





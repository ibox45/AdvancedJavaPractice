package _09_Arrays;

import java.util.Arrays;

public class Q02tekrar {

    public static void main(String[] args) {
        int arr1[][] = {{10, 20, 30}, {4}, {6, 7, 20}};
        int arrYeni[] = new int[arr1.length];

        for (int kat = 0; kat < arr1.length; kat++) {

            for (int dire = 0; dire < arr1[kat].length; dire++) {
                arrYeni[kat] += arr1[kat][dire];

            }
        }
        System.out.println(Arrays.toString(arrYeni));
    }
}


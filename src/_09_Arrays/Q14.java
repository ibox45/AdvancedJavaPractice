package _09_Arrays;

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {

        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
         */

        String str="Congratulations";
        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));

        String [] tersArr=new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i]=arr[arr.length-1-i];
            if(tersArr[i].contains("o") || tersArr[i].contains("a")  ||  tersArr[i].contains("u") ){
                tersArr[i]="i";

            }
            String yeni1=tersArr[i].replaceAll(",","");
            System.out.print(yeni1);

        }








    }
}

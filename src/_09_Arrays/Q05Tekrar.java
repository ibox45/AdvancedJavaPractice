package _09_Arrays;

public class Q05Tekrar {
    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        //for each ile cozum:

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        double toplam = 0;




        for (int each : arr ) {
        	toplam += each;
        }
        double ort = toplam / arr.length;

        for (int each : arr ) {
        	if (each > ort)
        System.out.println("ortalamadan buyuk olanlar :" + each);



        }
    }

}



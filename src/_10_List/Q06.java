package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

public class Q06 {
    /* TASK :
     * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
     * OUTPUT : [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        int []arr={1,2,2,3,1,4,2,5,6,8,7,5,9,1};


        List<Integer> tekrarsiz=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!tekrarsiz.contains(arr[i])){
                tekrarsiz.add(arr[i]);
            }


        }
        System.out.println(tekrarsiz);  //[1, 2, 3, 4, 5, 6, 8, 7, 9]
        Integer[] arr3=tekrarsiz.toArray(new Integer[0]);  //listi arraye cevırdık
        System.out.println(Arrays.toString(arr3));
    }
}

package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Q01 {

    /* TASK :
     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void main(String[] args) {

        List<String> list1= new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma",  "Omer"));

        //kendi yaptıgım (hatalı cozum olarak gosterilenmiş) Ancak ben i--; yaparak durumu biraz kurtarmısım :)

        for (int i = 0; i <list1.size() ; i++) {
            if(list1.get(i).toLowerCase().contains("a")){
                list1.remove(i);
                i--;


            }

        }System.out.println(list1);


        //haluk hocanın yaptıgı

        List<String> aOlmayanIsimler =new ArrayList<>();

        for (String each: list1
             ) {
            if(!each.toLowerCase().contains("a")){
                aOlmayanIsimler.add(each);
            }

        }
        System.out.println("a olmayan isimler : "+aOlmayanIsimler);
        list1.clear();
        list1.addAll(aOlmayanIsimler);
        System.out.println(list1);


        /*
hatalı cozum...
    List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");
        System.out.println(list1);
        List<String> yeniList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).toLowerCase().contains("a")){
                yeniList.add(list1.get(i));
                list1.remove(i);
            }
        }
        System.out.println("içinde a olan kelimeler : "+yeniList);
        System.out.println("listenin silinmiş kelimelerle son hali : "+list1);
    }
 */




    }



}

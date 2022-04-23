package javaProjects.P01_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {

    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
     */

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.print("1-" + (filmler.size()) + " arasinda bir sayi giriniz : ");
        int secilenFilmIndex = scan.nextInt()-1;
        filmGetir(filmler,secilenFilmIndex);



    }

    private static void filmGetir(List<String> filmler, int secilenFilmIndex) {
        System.out.println(filmler.get(secilenFilmIndex).replaceAll("\\w"," - "));
        System.out.println(filmler.get(secilenFilmIndex).length()+" harfli yabanci film tahmin etmek icin harf giriniz");

        char harf=' ';
        int tahminSayisi=0;
        int dogruTahminSayisi=0;
        String str="";


        do {


        }while((tahminSayisi-dogruTahminSayisi)!=filmler.get(secilenFilmIndex).length()*2);

        if((tahminSayisi-dogruTahminSayisi)==filmler.get(secilenFilmIndex).length()*2){
            System.out.println("Game Over");
            System.out.println("yanlıs tahmin sayısı : " + (tahminSayisi - dogruTahminSayisi));
            System.out.println(" game over....tahmin edemedigin film : " + filmler.get(secilenFilmIndex));
        }




    }


}

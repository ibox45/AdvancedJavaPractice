package _07_ForLoop;

public class Q21 {

    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */


        /*
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *       */



        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         */

      //  for (int i = 1; i <=9 ; i++) {
      //      for (int j = 1; j <=i ; j++) {
      //          System.out.print("* ");
//
      //      }
      //      System.out.println("");
      //  }


      //  for (int i = 1; i <=10 ; i++) {
      //      for (int j = i; j <=10 ; j++) {
      //          System.out.print("* ");
//
      //      }
      //      System.out.println("");
      //  }


        int i, k;//Değişkenlerimizi tanımladık.
        int sembol = 1;//Yıldızımızın program başlangıçında, kaç tane yıldız yazdıracağını belirtiriz.

        for (k = 0; k < 9; k++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
            for (i = 0; i < sembol; i++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
                System.out.print("* ");//Sembolümüzü belirttik.
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            sembol++;//Yıldızımızın birer birer artmasını sağlarız.
        }



    }
}

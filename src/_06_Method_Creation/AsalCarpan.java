package _06_Method_Creation;

import java.util.Scanner;

public class AsalCarpan {

    /* TASK :
     * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
     * METHOD create ediniz.
     *
     * Ör: Input : 50
     *     Bolenler : 2,5,10,25,50
     *     Asal Bolenler: 2,5
     *     En buyuk asal carpan: 5
     */
    static int bolen=0;
    static boolean isAsal=true;

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayi");
        int sayi=scan.nextInt();

asalCarpan(sayi);

    }

    private static void asalCarpan(int sayi) {
        int asalBolen=0;
        for (int i = 2; i <= sayi; i++) {
            if(sayi%i==0){
                bolen=i;
                asalMi(bolen);
            }if(isAsal){
                asalBolen=bolen;

            }

        }
        System.out.println(asalBolen);



    }

    private static boolean asalMi(int bolen) {
        for (int i = 2; i < bolen; i++) {
            if(bolen%i!=0){
                isAsal=true;


            }else{
                isAsal=false;
                break;
            }

        }
            return isAsal;
    }
}

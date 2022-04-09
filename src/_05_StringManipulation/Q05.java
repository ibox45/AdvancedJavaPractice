package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */

        String  str1= "%13.99";
        String str2= "%10.55";

        str1=str1.replace("%","");
        str2=str2.replace("%","");

        double str1Double=Double.valueOf(str1);
        double str2Double=Double.valueOf(str2);
        double toplam=str1Double+str2Double;
        System.out.println("toplam = " + toplam);









    }
}

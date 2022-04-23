package javaProjects.P03_UcusProjesi.Ucus_projesi02;

import java.util.Scanner;

public class JavaAirlines {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("javaAirlines'a hosgeldiniz \nB C D rotasından birini seciniz : ");
        String city=scan.next().toUpperCase();
        System.out.print("ucusunuz icin \ntek yon -->1 \ncift yon-->2 \ngiriniz : ");
        int flytype=scan.nextInt();

        System.out.print("yasinizi giriniz : ");
        int age=scan.nextInt();
        double priceB=0.10*500;
        double priceC=0.10*700;
        double priceD=0.10*900;

        if(city.equals("B")  ||  city.equals("C")  ||  city.equals("D")){

            if(age>65){
                if (city.equals("B")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceB*0.7+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceB*0.7*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("C")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceC*0.7+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceC*0.7*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("D")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceD*0.7+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceD*0.7*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }

            }else if(age>12 && age<24){
                if (city.equals("B")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceB*0.9+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceB*0.9*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("C")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceC*0.9+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceC*0.9*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("D")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceD*0.9+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceD*0.9*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }

            }else if(age>=0 && age<=12){
                if (city.equals("B")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceB*0.5+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceB*0.5*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("C")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceC*0.5+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceC*0.5*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("D")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceD*0.5+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceD*0.5*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }

            }else if (age>=24 && age<=65){
                if (city.equals("B")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceB+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceB*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("C")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceC+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceC*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }else if (city.equals("D")){
                    if(flytype==1){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+priceD+" $");
                    }else if(flytype==2){
                        System.out.println("      ******     ");
                        System.out.println("ucusunuz icin bilet odemeniz : "+(priceD*0.8)*2+" $");
                    }else{
                        System.out.println("hatali veri girdiniz");
                    }
                }

            }else{
                System.out.println("yasinizi dogru giriniz");
            }

        }else System.out.println("hatali giris yaptiniz");





    }
}

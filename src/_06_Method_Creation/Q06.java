package _06_Method_Creation;

public class Q06 {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        String input="aabbcccccddddaaa";


        birKezyazdiran(input);
    }

    private static void birKezyazdiran(String input) {

        String input2="";

        for (int i = 0; i < input.length(); i++) {

            if(!input2.contains(input.substring(i,i+1))){
                input2+=input.charAt(i);

            }


        }

        System.out.println(input2);
    }


}

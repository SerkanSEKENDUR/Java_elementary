package Project_elementary_01;

import java.util.Scanner;

public class E01_factorialNumber {
     /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720
       */
        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720
         */

    public static void main(String[] args) {

        System.out.println("Lütfen bir sayi yaziniz : ");
        Scanner num = new Scanner(System.in);

        String strNum = num.nextLine();
        int number = Integer.parseInt(strNum);

        int faktoriyel = 1;
        for (int i = 1; i <= number; i++) {
            faktoriyel *= i;
        }
        System.out.println(faktoriyel);
    }
}

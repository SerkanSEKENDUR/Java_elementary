package Project_elementary_02;

import java.util.Scanner;

public class E01_randomNumberBetweenTwoNumbers {
    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int
     */

    /*
    İki tane pozitif integer sayısı verildiğinde

    sayı 1 min degerinde

    sayı 2 max degerinde

    min ve max arasinda random sayi elde et(olustur)

    output veri tipi int olmali
     */

    public static void main(String[] args) {
        System.out.println("Lütfen iki sayi giriniz : ");

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();

        String[] elements = s1.split(" ");

        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        int randomInRange=min+(int)(Math.random()*((max-min)+1));
        System.out.println(randomInRange);
    }
}

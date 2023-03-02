package Project_elementary_01;

import java.util.Scanner;

public class E10_checkNumberEven {

    /*
        Given an int check the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.

     */
     /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et

        Eğer number çift ise  print true

        Eğer number tek ise  print false

        result true ya da false olmalı.
     */

    public static void main(String[] args) {

        System.out.println("Lütfen bir sayi yaziniz : ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
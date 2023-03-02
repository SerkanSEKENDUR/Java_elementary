package Project_elementary_01;

import java.util.Random;
import java.util.Scanner;

public class E09_randomNum {
    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int
     */

 /*
    Veri tipi integer olan max sayısı verildiğinde

    0 ile max sayisi arasindan random bir sayi elde et(olustur)

    output tipi int olmalı
  */
    public static void main(String[] args) {

        System.out.print("Lütfen bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int max=scanner.nextInt();
		
		for (int i=0 ; i<1 ; i++) {
			
			Random rnd = new Random();
			
			System.out.print(rnd.nextInt(max)+"\t");
		}
    }
}
package Project_elementary_01;

import java.util.Scanner;

public class E06_letterCountCheck {
    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false
     */

    /*
     Bir String verildiğinde

     Eger String harf sayisi tek ise true print et değilse false print et
     */

    public static void main(String[] args) {

        System.out.println("Lütfen bir kelime yaziniz : ");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if(word.length()%2==1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

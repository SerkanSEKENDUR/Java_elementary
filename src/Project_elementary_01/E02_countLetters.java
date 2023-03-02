package Project_elementary_01;

import java.util.Scanner;

public class E02_countLetters {

/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0

     input: bucket
            b:1
        output should be 1
        */
    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı

     input: bucket
            b:1
        output 1 olmalı
        */

    public static void main(String[] args) {

        System.out.println("Lütfen bir kelime yaziniz : ");
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

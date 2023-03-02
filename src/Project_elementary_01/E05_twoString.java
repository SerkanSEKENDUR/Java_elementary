package Project_elementary_01;

import java.util.Scanner;

public class E05_twoString {
     /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */
        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .

        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */

    public static void main(String[] args) {

        System.out.println("Lütfen iki kelime yaziniz : ");
        Scanner twoString = new Scanner(System.in);

        String allElements = twoString.nextLine();

        String[] elements = allElements.split(" ");

        String s1 = elements[0];
        String s2 = elements[1];

        if (s1.substring(s1.length() - 1).equals(s2.substring(0, 1))) {
            String s3 = s1.replace(s1.substring(s1.length() - 1), "");
            System.out.println(s3 + s2);
        } else {
            System.out.println(s1 + s2);
        }
    }
}

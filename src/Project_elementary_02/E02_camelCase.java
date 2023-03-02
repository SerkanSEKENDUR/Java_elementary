package Project_elementary_02;

public class E02_camelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa
     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa
     */
    public static void main(String[] args) {

        System.out.println(camelcase());
    }
    public static String camelcase() {

      String  camelCaseOncesi = "I lIVe in uSa";
        System.out.println("camelCaseOncesi = " + camelCaseOncesi);
        camelCaseOncesi.trim().replaceAll("[ ]+", " ");

        String[] dizi = camelCaseOncesi.trim().split(" ");

        String camelCaseSonrasi = "";
        System.out.println("camelCaseSonrasi = " + camelCaseSonrasi);

        for (String str : dizi) {
            camelCaseSonrasi += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }
        return camelCaseSonrasi.trim();
    }
}

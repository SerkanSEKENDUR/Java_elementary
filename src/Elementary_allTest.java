import Project_elementary_01.*;
import Project_elementary_02.E01_randomNumberBetweenTwoNumbers;
import Project_elementary_02.E02_camelCase;
import Project_elementary_02.E03_subtractionSquare;
import Project_elementary_02.E06_getPopulation;
import Project_elementary_03.E05_threeEvenOdd;
import Project_elementary_03.E06_updateRange;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Elementary_allTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void checkNumberEven1() {
        final String testString = "2";
        provideInput(testString);

        E10_checkNumberEven.main(new String[0]);

        String result = "true";
        Assert.assertTrue("output true olmalı ama sizin output " + getOutput(), getOutput().contains(result));
    }

    @Test
    public void checkNumberEven2() {
        final String testString = "5";
        provideInput(testString);

        E10_checkNumberEven.main(new String[0]);

        String result = "false";
        Assert.assertTrue("output false olmalı ama sizin output  " + getOutput(), getOutput().contains(result));
    }

    @Test
    public void totalLetterCountCheck1() {
        final String testString = "Editor";
        provideInput(testString);

        E06_letterCountCheck.main(new String[0]);

        String result = "false";
        Assert.assertTrue("output  false olmali ama sizin output " + getOutput(), getOutput().contains(result));
    }

    @Test
    public void totalLetterCountCheck2() {
        final String testString = "consist";
        provideInput(testString);

        E06_letterCountCheck.main(new String[0]);

        String result = "true";
        Assert.assertTrue("output  true olmali ama sizin output " + getOutput(), getOutput().contains(result));
    }

    @Test
    public void days1() {
        final String testString = "5";
        provideInput(testString);

        E03_days.main(new String[0]);

        Assert.assertTrue("output friday olmalı ama siziin output" + getOutput(), getOutput().toLowerCase().contains("friday"));
    }

    @Test
    public void days2() {
        final String testString = "2";
        provideInput(testString);

        E03_days.main(new String[0]);

        Assert.assertTrue("output tuesday olmalı ama siziin output" + getOutput(), getOutput().toLowerCase().contains("tuesday"));
    }

    @Test
    public void days3() {
        final String testString = "7";
        provideInput(testString);

        E03_days.main(new String[0]);

        Assert.assertTrue("output sunday olmalı ama sizin output" + getOutput(), getOutput().toLowerCase().contains("sunday"));
    }

    @Test
    public void days4() {
        final String testString = "10";
        provideInput(testString);

        E03_days.main(new String[0]);

        Assert.assertTrue("output  this is not a valid day olmalı ama sizin output " + getOutput(), getOutput().toLowerCase().contains("this is not a valid day"));
    }

    @Test
    public void age1() {
        final String testString = "16";
        provideInput(testString);

        E07_ageLimit.main(new String[0]);

        Assert.assertTrue("output  ehliyet almak icin cok gencsin olmalı ama sizin output :: " + getOutput(), getOutput().toLowerCase().contains("ehliyet almak icin cok gencsin"));
    }

    @Test
    public void age2() {
        final String testString = "21";
        provideInput(testString);

        E07_ageLimit.main(new String[0]);

        Assert.assertTrue("output istedigini yapabilirsin olmalı ama sizin output :: " + getOutput(), getOutput().toLowerCase().contains("istedigini yapabilirsin"));
    }

    @Test
    public void age3() {
        final String testString = "10";
        provideInput(testString);

        E07_ageLimit.main(new String[0]);

        Assert.assertTrue("output  facebook hesabi acmak icin cok gencsin olmalı ama sizin output :: " + getOutput(), getOutput().toLowerCase().contains("facebook hesabi acmak icin cok gencsin"));
    }

    @Test
    public void perfectSquare1() {
        final String testString = "100";
        provideInput(testString);

        E04_square.main(new String[0]);

        Assert.assertTrue("output true olmalı ama sizin output :: " + getOutput(), getOutput().contains("true"));
    }

    @Test
    public void perfectSquare2() {
        final String testString = "55";
        provideInput(testString);

        E04_square.main(new String[0]);

        Assert.assertTrue("output false olmalı ama sizin output :: " + getOutput(), getOutput().toLowerCase().contains("false"));
    }

    @Test
    public void printEvenNumbers1() {
        final String testString = "15";
        provideInput(testString);

        E08_printEvenNumbers.main(new String[0]);

        int i1 = Integer.parseInt(testString);
        for (int i = 0; i <= i1; i++) {
            if (i % 2 == 0) {
                String num = String.valueOf(i);

                Assert.assertTrue("output  false olmali ama sizin output :: " + getOutput(), getOutput().contains(num));
            }
        }

    }

    @Test
    public void printEvenNumbers2() {
        final String testString = "6";
        provideInput(testString);

        E08_printEvenNumbers.main(new String[0]);

        int i1 = Integer.parseInt(testString);
        for (int i = 0; i < i1; i++) {
            if (i % 2 == 0) {
                String num = String.valueOf(i);

                Assert.assertTrue("output true olmali ama sizin output :: " + getOutput(), getOutput().contains(num));
            }
        }

    }

    @Test
    public void RandomNum() {
        final String testString = "10";
        provideInput(testString);

        E09_randomNum.main(new String[0]);

        int i1 = Integer.parseInt(testString);

        String s1 = getOutput().replaceAll("[^\\d.]", "");

        int num = Integer.parseInt(s1.trim());

        Assert.assertTrue("output  0 ile 10 arasinda olmali ama sizin output :: " + getOutput(), 0 <= num && num <= 10);
    }

    @Test
    public void RandomNum2() {
        final String testString = "20";
        provideInput(testString);

        E09_randomNum.main(new String[0]);

        String s1 = getOutput().replaceAll("[^\\d.]", "");

        int num = Integer.parseInt(s1.trim());

        Assert.assertTrue("output  0 ile 20 arasinda olmali ama sizin output :: " + getOutput(), 0 <= num && num <= 20);

    }

    @Test
    public void RandomNumberBetweenTwoNumbers1() {
        final String testString = "70 100";
        provideInput(testString);
        E01_randomNumberBetweenTwoNumbers.main(new String[0]);

        String s1 = getOutput().replaceAll("[^\\d.]", "");

        int num = Integer.parseInt(s1.trim());

        Assert.assertTrue("output  70 ile 100 arasinda olmali ama sizin output :: " + getOutput(), 70 <= num && num <= 100);
    }

    @Test
    public void RandomNumberBetweenTwoNumbers2() {
        final String testString = "40 70";
        provideInput(testString);
        E01_randomNumberBetweenTwoNumbers.main(new String[0]);

        String s1 = getOutput().replaceAll("[^\\d.]", "");

        int num = Integer.parseInt(s1.trim());

        Assert.assertTrue("output  40 ile 70 arasinda olmali ama sizin output :: " + getOutput(), 40 <= num && num <= 70);
    }

    @Test
    public void factorialNumber1() {
        final String testString = "7";
        provideInput(testString);
        E01_factorialNumber.main(new String[0]);

        String myOutput = getOutput().trim();

        int intOutput = Integer.parseInt(myOutput);

        Assert.assertTrue("output 5040 olmalı ama sizin output :: " + getOutput(), intOutput == 5040);
    }

    @Test
    public void factorialNumber2() {
        final String testString = "9";
        provideInput(testString);
        E01_factorialNumber.main(new String[0]);

        String myOutput = getOutput().trim();

        int intOutput = Integer.parseInt(myOutput);

        Assert.assertTrue("output  362880 olmalı ama sizin output :: " + getOutput(), intOutput == 362880);
    }

    @Test
    public void twoString1() {
        final String testString = "cat tac";
        provideInput(testString);
        E05_twoString.main(new String[0]);

        String s1 = getOutput();

        Assert.assertTrue("output  -1 olmali ama sizin output :: " + getOutput(), s1.contains("catac"));
    }

    @Test
    public void twoString2() {
        final String testString = "cat dog";
        provideInput(testString);
        E05_twoString.main(new String[0]);

        String s1 = getOutput();

        Assert.assertTrue("output  -1 olmali ama sizin output :: " + getOutput(), s1.contains("catdog"));
    }

    @Test
    public void countE1() {
        final String testString = "one barber to other barber";
        provideInput(testString);
        E02_countLetters.main(new String[0]);

        String s1 = getOutput();

        Assert.assertTrue("out put should be 4 but  your out put is :: " + getOutput(), s1.contains("4"));
    }

    @Test
    public void countE2() {
        final String testString = "asdasdsa";
        provideInput(testString);
        E02_countLetters.main(new String[0]);

        String s1 = getOutput();

        Assert.assertTrue("out put should be 0 but  your out put is :: " + getOutput(), s1.contains("0"));
    }

    @Test
    public void updateRange1() {

        E06_updateRange u1 = new E06_updateRange();

        int[] arr = {1, 12, 13, 14, 25, 16, 47, 28, 19, 3};
        int min = 10;
        int max = 20;

        int[] arr2 = u1.uRange(arr, min, max);

        int[] expected = {1, -1, -1, -1, 25, -1, 47, 28, -1, 3};

        for (int i = 0; i < expected.length; i++) {

            if (arr2[i] != expected[i]) {

                Assert.assertTrue("expected result is " + expected[i] + " but your result is " + arr2[i], arr2[i] == expected[i]);
            }
        }
    }

    @Test
    public void updateRange2() {

        E06_updateRange u1 = new E06_updateRange();

        int[] arr = {1, 12, 53, 64, 55, 76, 57, 28, 19, 3};
        int min = 50;
        int max = 70;

        int[] arr2 = u1.uRange(arr, min, max);

        int[] expected = {1, 12, -1, -1, -1, 76, -1, 28, 19, 3};

        for (int i = 0; i < expected.length; i++) {

            if (arr2[i] != expected[i]) {

                Assert.assertTrue("expected result is " + expected[i] + " but your result is " + arr2[i], arr2[i] == expected[i]);
            }
        }
    }

    @Test
    public void SubtractionSquare1() {

        E03_subtractionSquare s1 = new E03_subtractionSquare();

        int result = s1.substSquare(8, 3);

        Assert.assertTrue("result should be 1332 but your result is " + result, result == 1332);
    }

    @Test
    public void SubtractionSquare2() {

        E03_subtractionSquare s1 = new E03_subtractionSquare();

        int result = s1.substSquare(10, 5);

        Assert.assertTrue("result should be 3250 but your result is " + result, result == 3250);
    }

    @Test
    public void CamelCase1() {

        E02_camelCase c1 = new E02_camelCase();

        String result = c1.camelcase();

        Assert.assertTrue("result should be  I Live In Usa but your result is " + result, result.equals("I Live In Usa"));
    }

    @Test
    public void CamelCase2() {

        E02_camelCase c1 = new E02_camelCase();

        String result = c1.camelcase();

        Assert.assertTrue("result should be --> I Live In Usa <--but your result is " + result, result.equals("I Live In Usa"));
    }

    @Test
    public void getPopulation1() {

        E06_getPopulation g1 = new E06_getPopulation();

        String[] country = {"Australia", "Bahamas", "Benin", "Côte d'Ivoire", "Eritrea", "New Zealand", "Panama"};

        int[] countryPopulation = {38928346, 36910560, 19237691, 11673021, 586632, 104425, 33931};

        String cName = "Benin";

        int result = g1.populationOfCountry(country, countryPopulation, cName);

        Assert.assertTrue("result should be  19237691 but your result is " + result, result == 19237691);
    }

    @Test
    public void getPopulation2() {

        E06_getPopulation g1 = new E06_getPopulation();

        String[] country = {"Australia", "Bahamas", "Benin", "Côte d'Ivoire", "Eritrea", "New Zealand", "Panama"};

        int[] countryPopulation = {38928346, 36910560, 19237691, 11673021, 586632, 104425, 33931};

        String cName = "Eritrea";

        int result = g1.populationOfCountry(country, countryPopulation, cName);

        Assert.assertTrue("result should be  586632 but your result is " + result, result == 586632);

    }

    @Test
    public void getPopulation3() {

        E06_getPopulation g1 = new E06_getPopulation();

        String[] country = {"Australia", "Bahamas", "Benin", "Côte d'Ivoire", "Eritrea", "New Zealand", "Panama"};

        int[] countryPopulation = {38928346, 36910560, 19237691, 11673021, 586632, 104425, 33931};

        String cName = "Germany";

        int result = g1.populationOfCountry(country, countryPopulation, cName);

        Assert.assertTrue("result should be -1 but your result is " + result, result == -1);
    }

    @Test
    public void ThreeEvenOdd1() {

        E05_threeEvenOdd t1 = new E05_threeEvenOdd();

        int[] arr = {2, 3, 4, 5, 12};

        boolean tt = t1.threeEvenOrOdd(arr);

        Assert.assertTrue("Expected result is true but your result is " + tt, tt);
    }

    @Test
    public void ThreeEvenOdd2() {

        E05_threeEvenOdd t1 = new E05_threeEvenOdd();

        int[] arr = {2, 3, 5, 14, 13};

        boolean tt = t1.threeEvenOrOdd(arr);

        Assert.assertTrue("Expected result is true but your result is " + tt, tt);
    }

    @Test
    public void ThreeEvenOdd3() {

        E05_threeEvenOdd t1 = new E05_threeEvenOdd();

        int[] arr = {2, 3, 14, 13};

        boolean tt = t1.threeEvenOrOdd(arr);

        Assert.assertFalse("Expected result is false but your result is " + tt, tt);
    }
}
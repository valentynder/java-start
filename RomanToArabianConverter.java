package ArabianRomanCalculator;


public class RomanToArabianConverter {
    public static int roToAr(String s) {
        int a = 0;
        if (s.equals("I")) {
            a = 1;

        } else if (s.equals("II")) {
            a = 2;

        } else if (s.equals("III")) {
            a = 3;

        } else if (s.equals("IV")) {
            a = 4;

        } else if (s.equals("V")) {
            a = 5;

        } else if (s.equals("VI")) {
            a = 6;

        } else if (s.equals("VII")) {
            a = 7;

        } else if (s.equals("VIII")) {
            a = 8;

        } else if (s.equals("IX")) {
            a = 9;

        } else if (s.equals("X")) {
            a = 10;

        }
        return a;
    }
}

package ArabianRomanCalculator;


public class ArabianToRomanConverter {
    public static String arToRo(int x) {

        int a = Math.abs(x / 10);
        int b = Math.abs(x % 10);

        String st1 = null;
        String st2 = null;

        if (a == 0) {
            st1 = "";
        } else if (a == 1) {
            st1 = "X";
        } else if (a == 2) {
            st1 = "XX";
        } else if (a == 3) {
            st1 = "XXX";
        } else if (a == 4) {
            st1 = "XL";
        } else if (a == 5) {
            st1 = "L";
        } else if (a == 6) {
            st1 = "LX";
        } else if (a == 7) {
            st1 = "LXX";
        } else if (a == 8) {
            st1 = "LXXX";
        } else if (a == 9) {
            st1 = "XC";
        } else if (a == 10) {
            st1 = "C";
        }

        if (b == 0) {
            st2 = "";
        } else if (b == 1) {
            st2 = "I";
        } else if (b == 2) {
            st2 = "II";
        } else if (b == 3) {
            st2 = "III";
        } else if (b == 4) {
            st2 = "IV";
        } else if (b == 5) {
            st2 = "V";
        } else if (b == 6) {
            st2 = "VI";
        } else if (b == 7) {
            st2 = "VII";
        } else if (b == 8) {
            st2 = "VIII";
        } else if (b == 9) {
            st2 = "IX";
        }

        return st1 + st2;

    }

}

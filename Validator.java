package ArabianRomanCalculator;


public class Validator {
    public static String arabianOrRoman(String s1, String s2) {
        String result1 = null;
        String result2 = null;
        String result = null;

        String[] arr1 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] arr2 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (String k : arr1) {
            if (s1.equals(k)) {
                result1 = "arabian";
            }
        }
        for (String m : arr2) {
            if (s1.equals(m)) {
                result1 = "roman";
            }
        }

        for (String n : arr1) {
            if (s2.equals(n)) {
                result2 = "arabian";
            }
        }
        for (String p : arr2) {
            if (s2.equals(p)) {
                result2 = "roman";
            }
        }

        if (result1.equals(result2) && result1.equals("arabian")) {
            result = "arabian";
        }
        if (result1.equals(result2) && result1.equals("roman")) {
            result = "roman";
        }
        if (!result1.equals(result2)) {
            System.out.println("Data types must be the same.");
            System.out.println("Restart with correct data types.");
        }


        return result;
    }
}



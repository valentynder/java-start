package ArabianRomanCalculator;

import java.util.Scanner;

import static ArabianRomanCalculator.Calculator.calc;
import static ArabianRomanCalculator.RomanToArabianConverter.roToAr;
import static ArabianRomanCalculator.Validator.arabianOrRoman;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the action like x#y,");
        System.out.println("where x and y are Arabian only or Roman only.");
        System.out.println("Arabian from 0 to 10, Roman from I to X.");
        String s1 = sc.nextLine();

        //int length = s1.length();
        int n = 0;
        for (int i = 0; i < s1.length() - 1; i++) {
            switch (s1.charAt(i)) {
                case '+':
                case '-':
                case '*':
                case '/':
                    n = i;
                    break;
            }
        }

        if (!s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/")) {
            System.out.println("You did not specify the action.");
        }


        String number1 = s1.substring(0, n).trim();
        String number2 = s1.substring(n + 1).trim();
        char operator = s1.charAt(n);

        int a = 0;
        int b = 0;

        if (arabianOrRoman(number1, number2).equals("arabian")) {
            a = Integer.parseInt(number1);
            b = Integer.parseInt(number2);
        } else {
            if (arabianOrRoman(number1, number2).equals("roman")) {
                a = roToAr(number1);
                b = roToAr(number2);
            }
        }

        calc(a, b, operator);
    }
}

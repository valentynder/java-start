package ArabianRomanCalculator;


import static ArabianRomanCalculator.ArabianToRomanConverter.arToRo;

public class Calculator {

    public static void calc(int a, int b, char c) throws NullPointerException {
        int result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/': {
                if (b != 0) {
                    result = a / b;
                } else {
                    throw new NullPointerException("DIVISION BY 0. ENTER THE CORRECT DATA.");
                }
            }
        }

        String r = arToRo(result);
        System.out.println("Result Arabian = " + result);
        if (result < 0) {
            System.out.println("Result Roman = " + "minus " + r);
        } else if (result > 0) {
            System.out.println("Result Roman = " + r);
        } else if (result == 0) {
            System.out.println("Result Roman = " + "Nulla");
        }
    }
}

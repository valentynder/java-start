package task2;
import java.util.Scanner;

public class SimpleFunctionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        double f = Math.log(Math.sin(x) + Math.exp(x) * (Math.sqrt(x) / Math.PI));

        System.out.println("f(x)= " + f);

    }
}

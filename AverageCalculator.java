package task2;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        double res=(a/2+b/2+(double)(a%2+b%2)/2);
        System.out.println(res);

    }
}

package task2;
import java.util.Scanner;

public class SimpleAboutMeSample {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your surname: ");
            String sName = sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("I'm " + name + " " + sName + ", " + age + " years old");
    }
}

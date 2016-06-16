package task1;

/**
 * Created by Leopard on 16.06.2016.
 * Калькулятор односимвольных операндов.
 */
import java.util.Scanner;
public class StringCalc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the action like x#y:");
        String s1=sc.nextLine();
        //System.out.println("You printed:"+s1);
        char i1 = s1.charAt(0);
        char i2 = s1.charAt(1);
        char i3 = s1.charAt(2);
        double r = 0;
        int x =i1-'0';
        int y =i3-'0';
        if(i2 == '+')
            r=x+y;
        else{
            if(i2=='-')
                r=x-y;
            else{
                if(i2=='*')
                    r=x*y;
                else{
                    if(i2=='/')
                        r=(double)x/y;
                    else{
                    System.out.println("Enter the correct action!");
                    }
                }
            }
        }
        System.out.println("Result: "+r);
    }

}

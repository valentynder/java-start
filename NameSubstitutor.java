package task2;
import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String mess = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        String rep = "${name}";
        String rep1 = "${surname}";

       if(mess.indexOf("${na")>0){
        String print = mess.replace(rep, name);
           System.out.println(print);
       }
        else if(mess.indexOf("${su")>0){
           String print = mess.replace(rep1, name);
             System.out.println(print);
       }

    }
}

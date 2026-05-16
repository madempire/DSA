
import java.util.Scanner;

public class FunctionClaas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // String name = s.next();

        // printMyName(name);

        int a = s.nextInt();
        int b = s.nextInt();
        int sum = sum(a, b);

        System.out.println(sum);

        System.out.println( product(a, b));
    }
    private static void printMyName(String name) {
        System.out.println(name);
    }

    // make a function to add 2 numbers and return the sum

    private static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

    private static int product(int a, int b) {
        int multiply = a * b;
        return multiply;
    }
}
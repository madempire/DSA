import java.util.Scanner;

public class Loops {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSumOfNNaturalNumbers(n);
        printEvenTillN(n);
        for(;;){
            System.out.println("cool");
        }
    }
    private static void printSumOfNNaturalNumbers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of n natural numbers "+sum);
    }


    private static void printEvenTillN(int n){
        for (int i = 1; i <= n ; i++) {
            if (i%2 == 0)
                System.out.println(i);
        }
    }
}

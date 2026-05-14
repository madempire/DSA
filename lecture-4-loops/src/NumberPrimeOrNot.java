import java.util.Scanner;

public class NumberPrimeOrNot {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1){
            System.out.println("Not prime number");
        } else {
            for (int i = 2; i < n; i++) {
                if (n%i == 0) {
                    System.out.println("Not prime number");
                    return;
                }
            }
            System.out.println("Prime Number");
        }

    }
}

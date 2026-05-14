
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // solidRhombus();
        // numberPyramid();
        // palindromicNumberPyramid();
        isGivenNumberisPalindrome();
    }
    private static void solidRhombus(){
        int n = 5;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    private static void numberPyramid(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void palindromicNumberPyramid(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void isGivenNumberisPalindrome(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= n/2; i++) {
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            if(n == 1){
                System.out.println("This is niether prime  not composite");
            } else {
                System.out.println("Prime");
            }
        } else {
            System.out.println("not prime");
        }
    }
}

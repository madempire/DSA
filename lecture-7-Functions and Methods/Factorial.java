public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        fact(5);
    }

    // recursion
    private static int factorial(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        if(n==1||n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    private static void fact(int n){

        if(n<0)
            System.out.println("Invalid Number");

        int fact = 1;
        for (int i = n; i >=1 ; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

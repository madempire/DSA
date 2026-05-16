public class Assginment {
    public static void main(String[] args) {
        if(isPrime(5))
        {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        if(isEven(4)){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        tableOfN(12);
    }
    private static boolean isPrime(int n) {
        if(n>1) {
            for (int i = 2; i <= n/2; i++) {
                if(n%i == 0){
                    return false;
                }
                else {
                    return true;
                }
            }
        } 
        return false;
    }

    private static boolean isEven(int n ) {
        if(n%2 == 0)
            return true;
        return false;
    }

    private static void tableOfN(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }
}

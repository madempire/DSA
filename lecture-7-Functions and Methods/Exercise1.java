
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // q1
        // int[] a = new int[5];
        // for (int i = 0; i < a.length; i++) {
        //     a[i] = s.nextInt();
        // }
        // System.out.println(averageOfN(a));

        // q2
        // int n = s.nextInt();
        // System.out.println(sumOfOddOfN(n));

        // q3
        // int a = s.nextInt();
        // int b = s.nextInt();

        // System.out.println("Greatest of "+a+" and "+b+" is "+findGreatest(a, b));


        // q4
        // int r = s.nextInt();
        // System.out.println("Circumeference "+circumference(r));

        // q5
        // int age = s.nextInt();
        // eligibilityForVote(age);

        // q6
        // for(;;){}

        // q7
        // int positive = 0;
        // int negative = 0;
        // int zeros= 0;

        // int countiueAccept;
        // do { 
        //     System.out.println("1. Add number");
        //     System.out.println("0. Exit");
        //     countiueAccept = s.nextInt();
        //     if (countiueAccept == 1) {
        //         int number = s.nextInt();
        //         if (number > 0)
        //             positive++;
        //         else if (number < 0)
        //             negative++;
        //         else
        //             zeros++;
        //     } else {
        //         System.out.println("Counting completed");
        //     }
        // } while (countiueAccept == 1);
        // System.out.println("0's "+zeros+" +'s "+positive+" -'s "+negative);

        // q8
        // int x = s.nextInt();
        // int n = s.nextInt();

        // System.out.println(findTheXToThePowerOfN(x,n));

        // q9
        // int a = s.nextInt();
        // int b = s.nextInt();
        
        // System.out.println(gcd(a,b));

        // q10
        int n = s.nextInt();
        fibonacci(n);

    }
    private static double averageOfN(int[] numbers) {
        double sum = 0;
        for(int a:numbers){
            sum+=a;
        }
        double average = sum / numbers.length;
        return average;
    }

    private static int  sumOfOddOfN(int n) {
       int sumOfOdd = 0;
       for (int i = 1; i <= n; i++) {
        if(i%2 != 0)
            sumOfOdd+=i;
       } 
       return sumOfOdd;
    }

    private static double  circumference(int r) {
        return 2*Math.PI*r;
    }

    private static void eligibilityForVote(int age) {
        if (age >= 18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    private static int findGreatest(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    private static int findTheXToThePowerOfN(int x, int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow*=x;
        }
        return  pow;
    }

    private static int gcd(int a, int b) {
        if(b == 0)
            return a;

        return gcd(b, a%b);
        
    }

    
    private static int  fibo(int n) {
        if(n<=1)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }

    private static void fibonacci(int n){
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

}

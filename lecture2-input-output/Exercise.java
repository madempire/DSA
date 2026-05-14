import java.lang.*;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        q1();
        q2(r);
        q3(n);
    }  
    
    private static void  q1(){
        int marks = 625;
        double accountBalance = 1000000.00;
        String name = "king";
        float percentage = 72.00f;
    }

    private static  void q2(int r){
        double area = Math.PI * r * r;
        System.out.println("Circle radius "+r);
        System.out.println("Area of Circle "+area);
        System.out.println("Perimeter of circle/ circumference "+2*Math.PI*r);
    }

    private static void q3(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }
}

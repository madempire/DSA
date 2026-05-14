import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtract");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Reminders");
        int operation = scanner.nextInt();

        switch (operation){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Division not possible");
                } else {
                    System.out.println(a/b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Division not possible");
                } else {
                    System.out.println(a%b);
                }
                break;
            default:
                System.out.println("Invalid Operations");
        }
    }
}

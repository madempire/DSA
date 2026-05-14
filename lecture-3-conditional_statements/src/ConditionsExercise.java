import java.util.Scanner;
public class ConditionsExercise {
    static void main() {
//        calculator();
        calendar();
    }
    private static void calculator(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result = 0;
        String operation = scanner.next();

        switch (operation){
            case "+": result = a+b;
                break;
            case "-": result = a-b;
                break;
            case "*": result = a*b;
                break;
            case "/": result = a/b;
                break;
            default:
                System.out.println("Invalid Operation Type");
        }
        System.out.println(result);
    }

    private static void calendar(){
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();

        switch (numberOfMonth) {
            case 1 :
                System.out.println("Jan");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            case 3 :
                System.out.println("Mar");
                break;
            case 4 :
                System.out.println("Apr");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("Jun");
                break;
            case 7 :
                System.out.println("Jul");
                break;
            case 8 :
                System.out.println("Aug");
                break;
            case 9 :
                System.out.println("Sep");
                break;
            case 10 :
                System.out.println("Oct");
                break;
            case 11 :
                System.out.println("Nov");
                break;
            case 12 :
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid number of the month");
        }
    }


}

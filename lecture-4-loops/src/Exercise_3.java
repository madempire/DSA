import java.util.Scanner;

public class Exercise_3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do{
            System.out.println("1. Add marks");
            System.out.println("0. Stop");
            i = scanner.nextInt();
            if (i == 1){
                System.out.println("Enter the marks of student");
                int marks = scanner.nextInt();
                if (marks >= 90){
                    System.out.println("good");
                } else if (marks >= 60) {
                    System.out.println("Also good");
                } else if (marks >=0 ) {
                    System.out.println("good as well");
                } else {
                    System.out.println("invalid marks");
                }
            } else {
                System.out.println("Stopped.");
            }
        } while (i == 1);
    }
}

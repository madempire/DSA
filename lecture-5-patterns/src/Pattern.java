public class Pattern {
    static void main() {
        solidRectangle();
        hollowRectangle();
        halfPyramid();
        invertedHalfPyramid();
        halfPyramidOneEightyRotated();
        halfPyramidWithNumbers();
        invertedHalfPyramidWithNumbers();
    }
//    1
    private static void solidRectangle() {
        System.out.println("Solid rectangle");
        int n = 4; // rectangle has 4 rows
        int m = 5; // rectangle has 5 columns
        for (int i = 1; i <= n; i++) {   // rectangle has 4 row and 5 columns //rows
            for (int j = 1; j <= m; j++) { //columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    2
    private static void hollowRectangle() {
        System.out.println("hollow rectangle");
        int n = 4; //rows
        int m = 5; //columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//    3
    private static void halfPyramid() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    4
    private static void invertedHalfPyramid() {
        int n = 4;
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    5
    private static void halfPyramidOneEightyRotated() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //print *'s
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    6
    private static void halfPyramidWithNumbers() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//    7
    private static void invertedHalfPyramidWithNumbers() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // or
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    }

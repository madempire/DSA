class Patterns{
    public static void main(String[] args) {
        System.out.println("Right Angled Triangle");
        // from the lecture for beginners
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        rightAngledTriangle(5);
    }
    private static  void rightAngledTriangle(int n){
        for(int i=1; i<=n; i++){
            for (int j =1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
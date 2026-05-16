public class Solution {
    public static void main(String[] args) {
        
        // gcd
        // int a = 48;
        // int b = 18;
        
        // while(a!=b){
        //     if(a>b)
        //         a = a - b;
        //     else
        //         b = b - a;
        // }

        // System.out.println(b);

        // fibonacci
        int n = 5;
        int a = 0, b = 1;

        if(n>1){
            for (int i = 2; i <= n; i++) {
                    System.out.println(b);
                    int temp = b;
                    b = b+a;
                    a = temp;
            }
            
        }
    }
}

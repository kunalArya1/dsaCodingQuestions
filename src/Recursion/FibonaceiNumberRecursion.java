package Recursion;

public class FibonaceiNumberRecursion {
    public static void main(String[] args) {
        System.out.println(fibonaceiNumber(6));
    }
    static int fibonaceiNumber(int n){
        // Base Condition
        if (n < 2){
            return n;
        }

        return fibonaceiNumber(n-1) + fibonaceiNumber(n-2);
    }
}

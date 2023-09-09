package BitManuplation.Questions;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 54;
        System.out.println(isOdd(num));
    }

     static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

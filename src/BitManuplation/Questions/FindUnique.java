package BitManuplation.Questions;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,4,2,1,3};
        System.out.println(getUnique(arr));
    }

    private static int getUnique(int[] arr) {
        int unique = 0;
        for(int n: arr){
            unique = unique ^ n;
        }
        return unique;
    }
}

package Arrays.Operation;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};

        for (int i = 2; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1 ] = 0;
        System.out.println(Arrays.toString(arr));
    }
}

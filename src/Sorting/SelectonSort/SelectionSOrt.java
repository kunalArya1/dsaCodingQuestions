package Sorting.SelectonSort;

import java.util.Arrays;

public class SelectionSOrt {
    public static void main(String[] args) {
        int [] arr = {1,3,4,0,9,10,-10,-30};
        selectionInc(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            int rightPosition = arr.length-i-1;

            // find maximum element
            int maxIndex = 0;
            for (int j = 0; j <= rightPosition; j++) {
                if (arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }

            // swap the maximum element with it right position
            int temp = arr[rightPosition];
            arr[rightPosition] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    public static void selectionInc(int [] arr){
        for (int i = 0; i < arr.length; i++) {

            // Finding the Minimum element Index
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //Swapping the Minimum element at it right place
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

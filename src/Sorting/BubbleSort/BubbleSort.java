package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,5,4,9,7,4,3,2,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr){
        for (int turn = 0; turn < arr.length -1 ; turn++) {
            for (int internalCompare = 0; internalCompare < arr.length-1; internalCompare++) {
                if (arr[internalCompare] > arr[internalCompare+1]){
                    int temp = arr[internalCompare];
                    arr[internalCompare] = arr[internalCompare+1];
                    arr[internalCompare+1] = temp;
                }
            }
        }
    }
}



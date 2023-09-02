package Sorting.BubbleSort;

import java.util.Arrays;

public class EnhancedBubbleSOrt {
    public static void main(String[] args) {
//        int [] arr = {1,9,4,7,6,5,8,3,2,2,6,8,9};
        int [] arr = {1,2,3,4,5,6};
        enBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void enBubbleSort(int [] arr){
        boolean swap = false;
        for (int turn = 0; turn < arr.length-1 ; turn++) {
            for (int internalTurn = 0; internalTurn < arr.length-1-turn; internalTurn++) {
                if (arr[internalTurn] > arr[internalTurn +1]){
                    int temp = arr[internalTurn];
                    arr[internalTurn] = arr[internalTurn +1];
                    arr[internalTurn+1] = temp;
                    swap = true;
                }

            }
            if(!swap){
                break;
            }
        }
    }
}

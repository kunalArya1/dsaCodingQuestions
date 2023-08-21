package Arrays.Syntax;

import java.util.Arrays;
import java.util.Scanner;

public class synatx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaration of array
        int [] arr ;
        // Initialization of array
        arr = new int[10];

        // Now Declaration and Initialization of array

        int [] arrr2 = new int[4];

        // Taking input in array using loop
        System.out.println("Enter Arrays data :- ");
        for (int i = 0; i < arrr2.length; i++) {
            arrr2[i] = sc.nextInt();
        }

        // Printing the data of array using loop

        System.out.println("Your arrays Data is :- ");
        for (int i = 0; i < arrr2.length; i++) {
            System.out.print(arrr2[i] + " ");
        }
        System.out.println();
        // Printing the arrays data using toString() method

        System.out.println(Arrays.toString(arrr2));

    }
}

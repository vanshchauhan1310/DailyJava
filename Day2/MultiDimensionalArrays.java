import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // In MultiDimensional ARRAY number of row is Mandatory Not the number of column
        // Syntax int [][] arr = new int [3][3]
        int[][] arr = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        // arr.length ==> Number of Rows
        System.out.println("Number of Rows : " + arr.length);

        Scanner in = new Scanner(System.in);

        // taking input from the user in 2d Array
        int[][] arr1 = new int[3][3];
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                // arr1[row][col] = in.nextInt(); // taking user input
                arr1[row][col] = (int) (Math.random() * 100); // taking random input
            }
        }

       // printing the value of 2d Array

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {  // ==>traditional Method 
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr1[row])); // Better then Traditional Method
        }      for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr1[row])); // Better then Traditional Method
        }

        for (int[] is : arr1) {
            System.out.println(Arrays.toString(is));  // More optimised and best than traditional Method 
        }
    }
}
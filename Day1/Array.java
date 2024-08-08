import java.util.Scanner;
import java.util.Arrays;

public class Array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Syntax Of Array is ==> datatype [] variable_name = new datatype[size]

        int roll[]; // Declaration of Array roll is getting defined in the stack 
        roll = new int[5]; // Memory Allocation of Array roll is getting allocated in the heap

        // In Java the Reference variable is stored in stack but object is stored in heap 

        // In java object Array may or may not be in contigunuous Memory Allocation because objects are stored in
        // heap and heap is managed by JVM  and in heap their is no contigunuous Memory Allocation
        // but primitive Array is stored in contiguous Memory Allocation because primitive Array is stored in stack

        // new keyword ==> It is used to create an object 

        // Example of Primitive Array 
        int a[] = new int[5]; // Here 5 is size of Array
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;  
        a[3] = 40;
        a[4] = 50;

        // taking the value of array by user 
        Scanner in = new Scanner(System.in);

        for(int i = 0;i<a.length;i++){
            a[i] = in.nextInt();
        }
        
        // printing the value of int array 

        // for(int i = 0; i<a.length;i++){
        //     System.out.println(a[i] + " "); ==> Traditional Way 
        // }

           for (int i : a) {
            System.out.println(i + " "); // ==> optimised Way 
           }

             System.out.println();






        // Example of non - Primitive Array /Object arrays
        String [] arr = new String[5];
        arr[0] = "Rahul";
        arr[1] = "Rohan";
        arr[2] = "Rahul";
        arr[3] = "Ram";
        arr[4] = "Rahul";

        // taking the value of array by user 

           for(int i=0;i<arr.length;i++){
            arr[i] = in.next();
           }

        // for(int i = 0; i<arr.length;i++){
        //     System.out.println(arr[i] + " ");    ==> Traditional Method 
        // }

        for (String string : arr) {
            System.out.println(string + " ");   // Optimised Way 
        }


        // convert Integer Array to String Arrays 
        int [] intArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(intArray));


        in.close();
    }
}

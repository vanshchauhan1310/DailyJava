import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

    public static void main(String[] args) {
        // ArrayList - when we do not Know the size of Array 

        // Syntax => ArrayList<Integer> List = new Arraylist<>()

         ArrayList<Integer> list = new ArrayList<>(); // ==> this is used to initialised the Arraylist 

        System.out.println(list); // ==> this is one of the method to print the list 
         list.add(10);
         list.add(20);
         list.add(30); // ==> .add is used to add element to Arraylist 
         list.add(40);
         list.add(60);

         System.out.println(list);

         list.set(4, 50); // ==> this is used to update the value in Array List 
         System.out.println(list);

         list.remove(4); //  ===> this is used to remove the value from Array list 
         System.out.println(list);

         Scanner in = new Scanner(System.in);

        // User input in Arraylist 

        for(int i=0;i<5;i++){
     list.add(in.nextInt());
 }


        // // Output in Array list
        for(int i=0;i<5;i++){
           System.out.println(list.get(i));
         }

        // Multi-Dimensional List 

        ArrayList<ArrayList<Integer>>list2 = new ArrayList<>();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list2.get(i).add(in.nextInt());
            }
        }

        System.out.println(list2);
    }
    
}

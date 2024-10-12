
public class Basics {
    // In java string are immutablee 
    
    // String Immutability:
    // In Java, String objects are immutable, which means once a String object is created, its content cannot be changed.
    // When you perform operations that seem to modify a string, you're actually creating a new String object.
    // Memory usage: Each string operation that appears to modify the string actually creates a new String object.
    // Performance: For many string manipulations, this can be inefficient.
    
    // study about STRING BUILDER 
    

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original string: " + str);
        System.out.println("Original string's hashcode: " + str.hashCode()); // hashcode() it is used to give address that where in memory it is stored Just like
                                                                             // (pointer) memory address in c  
        
        System.out.println("");

        str = str + " World";
        System.out.println("Modified string: " + str);
        System.out.println("Modified string's hashcode: " + str.hashCode());

        System.out.println("");

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);
        System.out.println("Original StringBuilder's hashcode: " + sb.hashCode());
        
        System.out.println("");

        sb.append(" World");
        System.out.println("Modified StringBuilder: " + sb);
        System.out.println("Modified StringBuilder's hashcode: " + sb.hashCode());

        System.out.println("");

        System.out.println("Comman String Builder Method");

        System.out.println("");

         // Append
         sb.append(" World");
         System.out.println(sb);  // Output: Hello World

         System.out.println("");
         
         // Insert
         sb.insert(5, " Beautiful");
         System.out.println(sb);  // Output: Hello Beautiful World
         
         System.out.println("");

         // Delete
         sb.delete(5, 15);
         System.out.println(sb);  // Output: Hello World
         
         System.out.println("");

         // Replace
         sb.replace(6, 11, "Java");
         System.out.println(sb);  // Output: Hello Java

         System.out.println("");
         
         // Reverse
         sb.reverse();
         System.out.println(sb);  // Output: avaJ olleH

         System.out.println("");
         
         // Convert to String
         String result = sb.toString();
         System.out.println("Final string: " + result);

         System.out.println("");
 

        System.out.println("Comparison who is faster (string,stringBuilder)");

        System.out.println("");

         long startTime, endTime;
        
         // Using String
         startTime = System.nanoTime();
         String str1 = "";
         for (int i = 0; i < 10000; i++) {
             str1 += "a";
         }
         endTime = System.nanoTime();
         System.out.println("Time taken by String: " + (endTime - startTime) + " ns");
        
         System.out.println("");
        
         // Using StringBuilder
         startTime = System.nanoTime();
         StringBuilder sb1 = new StringBuilder();
         for (int i = 0; i < 10000; i++) {
             sb1.append("a");
         }
         endTime = System.nanoTime();
         System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");
 

         // string Builder and string buffer are same but 
        //  StringBuilder: Mutable, not thread-safe, generally faster.
        // StringBuffer: Mutable, thread-safe, slightly slower than StringBuilder.



        }

}

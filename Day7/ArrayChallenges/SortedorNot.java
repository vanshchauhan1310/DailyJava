 package Day7.ArrayChallenges;

 public class SortedorNot {


    public static void main(String[] args) {
        boolean issorted =true;
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted = false;
                break;
            }
            else{
                issorted = true;
            }  
        }

        if (issorted) {
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
    
}
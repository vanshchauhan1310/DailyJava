 package Day3;

 public class LinearSearch {

    public static void main(String[] args) {
      // time complexity of Linear Search 
     // Best Case   - o(1)
    // worst Case  - o(n) => N size of Array 
        
    
    int nums [] = {1,3,8,9,4,21,32,43};
    int target = 8;

    int ans = linear(nums, target);

    System.out.println(ans);

    }

    static int linear(int [] arr,int target){
        if (arr.length==0) {
            return -1;            
        }

        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if (element == target) {
                return i;                
            }
        }
        return -1;
    }
    
}
package Day3;

public class BinarySearch {
    public static void main(String[] args) {

    int nums [] = {1,5,7,8,9};
    int target = 8;
    int result = Binary(nums, target);
    System.out.println(result);

    }


    public static int Binary(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
        int mid = start + (end - start) / 2;
        if (arr[mid]==target) {
            return mid;
        }
        else if (arr[mid]>target) { // If we are given an descending order array then just change this condition 
            end = mid-1;
        }
        else {
            start = mid+1;
        }
        
    }

    return -1;
}
}

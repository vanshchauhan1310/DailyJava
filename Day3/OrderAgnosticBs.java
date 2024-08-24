package Day3;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        // int[] nums = {1, 3, 5, 7, 9};
        int[] nums = {9, 7, 5, 3, 1};
        int target = 7;
        int result = Bs(nums, target);
        System.out.println("Index of target element is: " + result);

    }

    public static int Bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } 
        else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (isAsc) {
                if (arr[mid] < target) {
                    end= mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;//
                }
            }
        }
        
        return -1;
    }
}
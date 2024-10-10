package Day7.ArrayChallenges;

public class NumberofOcurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                }
            }

        System.out.println(count); 
    }
}

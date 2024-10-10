package Day7.ArrayChallenges;

public class MaxAndMin {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Maximum(array);
        Minimum(array);



    }

    public static void Maximum(int [] array){
        int n = array.length;
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }

    public static void Minimum(int [] array){
        int n = array.length;
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
                }
            }
        System.out.println("Minimum element is: " + min);
    }

}

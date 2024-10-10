package Day7.ArrayChallenges;

public class SumAndAverage {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        int average = Average(sum,numbers);

        System.out.println("The sum of element in an array is "  + sum);
        System.out.println("The Average of element in an array is "  + average);

    }

    public static int sumArray(int [] numbers){
        int add=0;
        int n = numbers.length;
        for(int i=0;i<n;i++){
            add += numbers[i];
        }

        return add;
    }

    public static int Average(int sum,int[]numbers){
        int n = numbers.length-1;
        int result = sum/n;

        return result;
  
    }





    
}
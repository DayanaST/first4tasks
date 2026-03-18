package Assignment1;

public class Average {
    public static void main(String[] args) {
        int [] numbers={3,2,4,1};
        int count=4;
        double sum=calculateSum(numbers,count);
        double average=sum/count;
        System.out.println("Average:"+average);
    }

    public static double calculateSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + calculateSum(arr, n - 1);
    }

}

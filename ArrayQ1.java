//find the second largest number from array
//find the second smallest number from array
import java.util.*;

public class ArrayQ1 {
    public static int findSecondLargest(int[] arr, int length) {
        Arrays.sort(arr);
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
           throw new IllegalArgumentException("There is no second largest element.");
        }
        return second;
    }

    public static int findSecondSmallest(int[] arr, int length) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] > first) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("There is no second smallest element.");
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 5 elements of array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int length = arr.length;
        System.out.println("Second largest number is: " + findSecondLargest(arr, length));
        System.out.println("Second smallest number is: " + findSecondSmallest(arr, length));
    }
}

//Rearrange the array in increasing-decreasing order
import java.util.Arrays;

public class ArrayQ8 {
    public static void increasingOrder(int[] array) {
        System.out.println("Array in increasing order is : " + Arrays.toString(array));
    }

    public static void decreasingOrder(int[] array) {
        System.out.print("Array in decreasing order is : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = { 12, 32, 11, 76, 23, 98, 23 };
        Arrays.sort(array);
        increasingOrder(array);
        decreasingOrder(array);
    }
}

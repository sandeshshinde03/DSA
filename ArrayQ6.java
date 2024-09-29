// Reverse a given array
import java.util.Arrays;

public class ArrayQ6 {
    public static void reverse(int[] array) {
        int temp;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = { 12, 43, 13, 45, 68, 90, 67, 36 };
        reverse(array);
    }
}

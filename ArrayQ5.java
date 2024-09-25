// Find the smallest number in an array
// Find the largest number in an array
public class ArrayQ5 {
    public static int findSmall(int[] array) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }

        return small;
    }

    public static int findLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        int[] array = { 11, 43, 9, 23, 9, 7, 38, 22, 98, 98, 7 };
        System.out.println("Smallest element in array :" + findSmall(array));
        System.out.println("Largest element in array :" + findLargest(array));
    }
}

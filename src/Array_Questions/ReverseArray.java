package Array_Questions;
//you are given an array of integers arr[]. You have to reverse the given array.
public class ReverseArray {

    static void reverseArray(int[] arr) {
        int right = arr.length - 1;
        int left = 0;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
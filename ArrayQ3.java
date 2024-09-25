// Write a program to sort an array using Bubble Sort.
import java.util.Scanner;

public class ArrayQ3 {
    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrayInput(int[]arr){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 8 elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        System.out.println(arr.length);
        arrayInput(arr);
        System.out.println("\nBefor sorting array: ");
        printArray(arr);
        System.out.println("\nAfter sorting array: ");
        bubbleSort(arr);
        printArray(arr);

    }
}

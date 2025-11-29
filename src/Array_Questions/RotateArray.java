package Array_Questions;
//Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps,
// where d is a positive integer. Do the mentioned change in the array in place.
//Input: arr[] = [1, 2, 3, 4, 5], d = 2
//Output: [3, 4, 5, 1, 2]
//Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
public class RotateArray {
    public static void rotateArray(int[]arr,int d){
        int length=arr.length;
        // Handle case when d > length
        d = d % length;
        // Reverse the first d elements
        reverse(arr,0,d-1);
        // Reverse the remaining n-d elements
        reverse(arr,d,length-1);
        // Reverse the entire array
        reverse(arr,0,length-1);
    }
    public static void reverse(int[]arr,int start,int end){
        //reverse the array
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr={1, 2, 3, 4, 5};
        rotateArray(arr,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

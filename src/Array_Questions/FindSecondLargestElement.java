package Array_Questions;
//Given an array of positive integers arr[], return the second largest element from the array.
//If the second largest element doesn't exist then return -1.
import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargestElement {
    public int Find2Largest(int []arr){
        int length=arr.length;
        if(length<2){
            return -1;
        }
        Arrays.sort(arr);
        for (int i = length-2; i >=0 ; i--) {
            if(arr[i]!=arr[length-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={12,10,12};
        FindSecondLargestElement f1=new FindSecondLargestElement();
        System.out.println(f1.Find2Largest(arr));
    }
}

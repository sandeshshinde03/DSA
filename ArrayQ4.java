//Write a program to implement binary search.
public class ArrayQ4 {
    public static int binarySearch(int[]arr,int key){
        int start=0;
        int end=arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            int mid=(start+end)/2;
            if (arr[mid]==key) {
                return mid;
            }
            if (arr[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={12,14,16,18,19,20,22,35,98};
        int key=38;
        System.out.println(binarySearch(arr, key));
        if (binarySearch(arr, key)!=-1) {
            System.out.println("key found at index: "+binarySearch(arr, key));
        }
        else{
            System.out.println("Key not found");
        }
        
    }
}

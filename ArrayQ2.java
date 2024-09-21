//task is to determine if it is possible to split the original array into two parts that satisfy following conditins.
//1)both array should have the same number of elements. 2)All the elements must be distinct in both array.
// If it’s possible, you should return true; otherwise, return false.
public class ArrayQ2 {
    public static boolean isPossibleToSplit(int[] nums) {
        boolean possible = true;
        if ((nums.length % 2) == 0) {
            for (int i = 0; i < nums.length; i++) {
                int counter = 1;
                for (int j = 0; j < nums.length - 1; j++) {
                    if (i != j && nums[i] == nums[j]) {
                        counter++;
                    }
                }
                if (counter > 2) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return possible;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 3 };
        System.out.println(isPossibleToSplit(nums));
    }
}
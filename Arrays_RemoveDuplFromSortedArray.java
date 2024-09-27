// REMOVE DUPLICATES FROM THE SORTED ARRAY
// return the number of elements left in the array after removing duplicates

import java.util.Arrays;

class Arrays_RemoveDuplFromSortedArray {

    public static int[] removeDupl(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        // Instead of returning k, we are returning the resulted array where k is the number of elements left
        return Arrays.copyOfRange(nums, 0, k+1);
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 4, 4, 6, 7, 7, 8, 8, 8};
        int[] res = removeDupl(nums);
        System.out.println(Arrays.toString(res));
    }
}

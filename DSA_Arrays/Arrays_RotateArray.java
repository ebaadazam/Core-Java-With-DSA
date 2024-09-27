// ROTATE ARRAY

package DSA_Arrays;
import java.util.Arrays;

class Arrays_RotateArray {

    public void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n; // to make sure k is not greater than the length of nums
        
        reverse(nums, 0, n-1); // reversing whole array
        reverse(nums, 0, k-1); // reversing array till k
        reverse(nums, k, n-1); // reversing array from k till last
    }

    // Simply reversing the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        Arrays_RotateArray obj = new Arrays_RotateArray();

        System.out.println(Arrays.toString(nums));
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}

import java.util.Arrays;

public class Arrays_PlusOne {
    public static int[] plusOne(int[] nums){
        int n = nums.length;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0; 
        }

        // if nums is [9, 9, 9] or [9, 9] or [9], we add 1 at start
        int[] newArr = new int[n+1];
        newArr[0] = 1;
        return newArr;
    }
    public static void main(String[] args) {
        int[] nums = {9, 9, 9};
        int[] res = plusOne(nums);
        System.out.println(Arrays.toString(res));
    }
}

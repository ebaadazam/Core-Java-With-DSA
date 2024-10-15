import java.util.Arrays;
public class Arrays_SecondLargestNumber {
    public static int[] sample(int[] nums) {
        int n = nums.length;
        int max=0;
        int secMax=0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secMax = max;
                max = nums[i];
            }
            else if (nums[i] > secMax) {
                secMax = nums[i];
            }
        }
        return new int[]{max, secMax};
    }
    public static void main(String[] args) {
        int[] nums = {1222, 6, 34, 322, 76, 4500, 3200};
        int[] res = sample(nums);
        System.out.println("[Max, SecMax]: " + Arrays.toString(res));
    }
}

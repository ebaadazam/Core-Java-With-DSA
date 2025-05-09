import java.util.Arrays;
public class Arrays_ThirdLargestNumber {
    public static int[] sample(int[] nums) {
        int n = nums.length;
        int max=0, secMax=0, thirdMax=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                thirdMax = secMax;
                secMax = max;
                max = nums[i];
            }
            else if (nums[i] > secMax) {
                thirdMax = secMax;
                secMax = nums[i];
            }
            else if (nums[i] > thirdMax) {
                thirdMax=nums[i];
            }
        }
        return new int[]{max, secMax, thirdMax};
    }
    public static void main(String[] args) {
        int[] nums = {1222, 6, 34, 32, 76, 45, 320};
        int[] res = sample(nums);
        System.out.println("[Max, SecMax, ThirdMax]: " + Arrays.toString(res));
    }
}
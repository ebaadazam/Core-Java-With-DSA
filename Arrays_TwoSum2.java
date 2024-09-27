// TWO SUM II: INPUT ARRAY IS SORTED

public class Arrays_TwoSum2 {
    public static void twoSum2(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = (nums[i] + nums[j]);
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else{
                System.out.println("The Indices are: " + i + " and " + j);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 22, 39};
        int target = 33;
        twoSum2(nums, target);
    }
    
}

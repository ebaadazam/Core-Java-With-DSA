// TWO SUM I

import java.util.HashMap;
public class Arrays_TwoSum1 {
    public static void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                System.out.println("The Indices are: " + map.get(diff) + " and " + i);
            }
            else {
                map.put(nums[i], i);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 17, 11, 15, 8};
        int target = 19;
        twoSum(nums, target);
    }
}

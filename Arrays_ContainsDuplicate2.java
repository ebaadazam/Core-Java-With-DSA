// CONTAINS DUPLICATE II
// The difference of indices of two same values in the list should be less than or equal to k

import java.util.HashMap;
import java.util.Map;

class Arrays_ContainsDuplicate2 {

    public static boolean containsDupl(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsDupl(nums, k));
    }
}

package DSA_Arrays;
class Arrays_MinimumSizeSubarraySum {

    private static int minSubarray(int[] nums, int target) {
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int total = 0;

        while (r < nums.length) {
            total += nums[r];
            while (total >= target) {
                minLen = Math.min(minLen, r - l + 1);
                total -= nums[l];   
                l++;
            }
            r++;
        }
        // If minLen was not updated, return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int res = minSubarray(nums, target);
        System.out.println(res);
    }    
}


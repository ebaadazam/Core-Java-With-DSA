// trapping rainwater
// minimum size subarray sum
// maximum subarray sum
// longest consequetive sequence

class CoreJavaPractice {
    private static int sample(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) { sum = 0; }           
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
    }    
}
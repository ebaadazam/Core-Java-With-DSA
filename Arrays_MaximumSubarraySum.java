// Kadane’s Algorithm 
// Kadane's Algorithm is a famous algorithm used to solve the Maximum Subarray Problem, which aims to 
// find the contiguous subarray within a one-dimensional numeric array that has the largest sum.
class Arrays_MaximumSubarraySum {
    
    private static int maxSubarraySum(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++) {
            sum += nums[i];

            maxSum = Math.max(maxSum, sum);

            if(sum < 0) {
                sum = 0;
            }        
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maxSubarraySum(nums);
        System.out.println(res);
    }    
}
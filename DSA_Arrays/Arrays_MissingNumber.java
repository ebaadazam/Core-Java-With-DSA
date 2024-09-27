package DSA_Arrays;
class Arrays_MissingNumber {
    private static int missingNum(int[] nums) {
        int n = nums.length+1;
        int actualSum = (n * (n + 1)) / 2;
        int tempSum=0;
        for(int i : nums) {
            tempSum += i;
        }
        return actualSum-tempSum;
    }
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 2};
        System.out.println(missingNum(nums));
    }    
}

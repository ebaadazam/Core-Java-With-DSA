class Arrays_PalindromeArray {
    private static boolean isValidPalindrome(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums.length-1-i]) {
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 2};
        System.out.println(isValidPalindrome(nums)); 
    } 
}
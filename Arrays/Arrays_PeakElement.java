class Arrays_PeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        // If it is the first element
        if(n==1 || nums[0] >= nums[1]){
            return 0;
        }
        // If it is the last element
        else if(nums[n-1] >= nums[n-2]){
            return n-1;
        }
        for(int i=1; i < n; i++){
            // If it is the some middle element
            if(nums[i] > nums[i+1] && nums[i] > nums[i-1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(findPeakElement(nums));
    }
}
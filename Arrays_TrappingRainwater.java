// TRAPPING RAINWATER

class Arrays_TrappingRainwater {

    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        int total = 0;

        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                total += (maxLeft - height[left]);
            }
            else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                total += (maxRight - height[right]);
            }
        }
        return total;
    }
    public static void main(String[] args) {
        // int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height = {4,2,0,3,2,5};      
        int totalWater = trap(height);
        System.out.println(totalWater);
    }
}

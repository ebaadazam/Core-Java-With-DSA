class Stack_TrappingrainWater {
    public int trap(int[] height, int left, int right) {
        int area = 0;
        int maxLeft = height[left];
        int maxRight = height[right];
        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                area += (maxLeft - height[left]);   
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                area += (maxRight - height[right]);
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Stack_TrappingrainWater obj = new Stack_TrappingrainWater();
        int[] height = {4,2,0,3,2,5};
        int res = obj.trap(height, 0, height.length - 1);
        System.out.println(res);
    }
}
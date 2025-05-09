// REMOVE ELEMENT
// Remove all occurrences of a particular number in an array and return the no of elements in nums which are not equal to val.

class Arrays_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i : nums) {
            if (i != val) {
                nums[k] = i;
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = removeElement(nums, val);
        System.out.println(res);
    }
}

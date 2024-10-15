// import java.util.Arrays;
// public class CoreJavaPractice {
//     public static void reverse(int[] nums) {
//         for (int i = 0; i < nums.length/2; i++) {
//             int temp = nums[i];
//             nums[i] = nums[nums.length-1-i];
//             nums[nums.length-1-i] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5, 6};
//         reverse(nums);
//         System.out.println(Arrays.toString(nums));
//     }
// }

import java.util.Arrays;
public class CoreJavaPractice {
    public static void reverse(int[] nums) {
        int i=0, j=nums.length-1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
}

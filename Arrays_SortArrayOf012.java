// This is called Dutch National Flag Algorithm, which sorts the array in one pass (O(n)) without using
// extra space. In this problem, we move mid and when 

import java.util.Arrays;
public class Arrays_SortArrayOf012 {

    public static void sortArray(int[] nums){
        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                // swap mid with left as left is reponsible for smaller numbers and increment both
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            }
            else if (nums[mid] == 1) {
                // just increment mid as 1 should be in the middle
                mid++;
            }
            else if(nums[mid] == 2){
                // swap mid with right as right is reponsible for bigger numbers and decrement right only
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0, 2, 1, 0, 1, 2};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}


// Another solution but not recommended
// import java.util.ArrayList;
// import java.util.List;
// public class CoreJavaPractice {
//     public static List<Integer> sample(int[] nums){
//         int countZero=0, countOne=0, countTwo=0;
//         for (int i : nums) {
//             if (i==0) {
//                 countZero++;
//             } else if (i==1) {
//                 countOne++;
//             } else {
//                 countTwo++;
//             }
//         }
//         List<Integer> arr = new ArrayList<>();
//         while (countZero!=0) {
//             arr.add(0);
//             countZero--;
//         }
//         while (countOne!=0) {
//             arr.add(1);
//             countOne--;
//         }
//         while (countTwo!=0) {
//             arr.add(2);
//             countTwo--;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] nums = {1, 0, 2, 1, 0, 2, 1, 0, 1, 2};
//         System.out.println(sample(nums));
//     }
// }
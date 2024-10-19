// Find first and last position of element in sorted array using two pointers approach
import java.util.ArrayList;
import java.util.List;
public class Arrays_FindFirstAndLastPositionOfElementInSortedArray {
    private static List<Integer> sample(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[]{-1, -1};
        // traversing from left and break wher target is found
        while (left <= right) {
           if (nums[left] == target) {
            result[0] = left;
            break;
           } left++;
        }
        // traversing from right and break wher target is found
        while (left <= right) {
            if (nums[right] == target) {
                result[1] = right;
             break;
            } right--;
         }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10, 7, 2};
        int target = 7;
        System.out.println(sample(nums, target));
       
    }
}
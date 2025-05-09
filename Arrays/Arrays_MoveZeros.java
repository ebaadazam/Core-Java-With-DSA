// Most Efficient Solution
import java.util.Arrays;
public class Arrays_MoveZeros {
    public static void moveZeroes(int[] nums) {
        int index = 0; // Tracks the position for the next non-zero element

        // Move all non-zero elements to the beginning of the array
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}


// import java.util.Arrays;
// public class Arrays_MoveZeros {
//     public static void moveZeroes(int[] nums) {
//         int i = 0;
//         int j = i+1;
//         while (j < nums.length) {
//             if (nums[i] == 0 && nums[j] != 0) {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 i++; j++;
//             }
//             else if(nums[i] != 0 && nums[j] == 0){
//                 i++; j++;
//             } 
//             else if(nums[i] != 0 && nums[j] != 0){
//                 i++; j++;
//             }
//             else if(nums[i] == 0 && nums[j] == 0){
//                 j++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {0, 1, 0, 3, 12};
//         moveZeroes(nums);
//         System.out.println(Arrays.toString(nums));
//     }
// }


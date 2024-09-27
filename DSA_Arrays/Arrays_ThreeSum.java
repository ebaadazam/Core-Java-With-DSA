package DSA_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Arrays_ThreeSum {

    private static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();

        for(int k=0; k < nums.length; k++){

            if(k > 0 && nums[k] == nums[k-1]) {
                continue;
            }

            int i = k+1;
            int j = nums.length-1;
            while (i < j) {

                int sum = (nums[i] + nums[j] + nums[k]);
                
                if (sum < 0) {
                    i++;
                }
                else if (sum > 0) {
                    j--;
                }
                else if (sum == 0) {
                    arr.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++; j--;
                
                    while (i < j && nums[i] == nums[i-1]) i++;
                    while (i < j && nums[j] == nums[j+1]) j--;
                }
            }
        }
        return arr;
    }  
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);
    }  
}


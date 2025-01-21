
//--------dependencies--------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class CoreJavaPractice {
    // move zeros
    public static int sample(int[] nums) {

        // ------------start-------------
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        // ------------end--------------
    }

    public static void main(String[] args) {

        // -------------start------------
        int[] nums = {7,0,4,0,2,0,1};
        int[] res = sample(nums);
        System.out.println(Arrays.toString(res));
        // -------------end--------------

    }
}
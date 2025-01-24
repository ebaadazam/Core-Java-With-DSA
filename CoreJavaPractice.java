
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
    public static int sample(int[] nums) {
        // LCS
        // ------------start-------------
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) { set.add(i); }
        int maxCount = Integer.MIN_VALUE;
        for (Integer n : set) {
            if (!set.contains(n-1)) {
                int count = 1;
                while (set.contains(n+1)) {
                    count++; n++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
        // ------------end--------------
    }

    public static void main(String[] args) {

        // -------------start------------
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(sample(nums));
        // -------------end--------------

    }
}
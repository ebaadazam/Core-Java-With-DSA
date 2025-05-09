// longest consecutive sequence

import java.util.HashSet;
import java.util.Set;
class Sample {
    public static int sample(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (Integer val : nums) { set.add(val); }
        System.out.println("set: " + set);
        int maxCount = 0;
        for (Integer integer : set) {
            if (!set.contains(integer-1)) {
                int count = 1;
                while (set.contains(integer + 1)) {
                    integer++; count++;
                } maxCount = Math.max(maxCount, count);
            } }
        return maxCount; }
    public static void main(String[] args) {
        int[] nums = {5, 12, 100, 4, 200, 1, 2};
        System.out.println(sample(nums));
    }
}
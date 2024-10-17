import java.util.HashSet;
import java.util.Set;

class String_LongestConsecutiveSequence {
    private static int sample(int[] nums){
        int maxCount = 0;
        
        // Adding nums values to Set
        Set<Integer> set = new HashSet<>();
        for (Integer val : nums) {
            set.add(val);
        }

        for (int num : set) {
            // If it is not the start of the sequence
            if (!set.contains(num - 1)) {
                int count = 1;
                // If it makes the continuous sequence
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(sample(nums));
    }
}
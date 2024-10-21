import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Arrays_MostRepetitiveElement {

    public static int repetitiveElement(int[] nums){

        int maxItem = 0;
        int mostMax = nums[0];
        Map<Integer,Integer> map = new HashMap<>();
        
        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1); // inserting all elements in the map

            if (map.get(i) > maxItem) {
                maxItem = map.get(i);
                mostMax = i;
            }
        }
    
        return mostMax;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 2, 6, 4, 7, 2, 7, 7, 8, 4, 2};
        System.out.println(repetitiveElement(nums));
    }
}
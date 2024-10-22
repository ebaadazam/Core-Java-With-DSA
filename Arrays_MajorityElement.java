// Without extra space
class Arrays_MajorityElement {
    public static int majorityElement(int[] nums){
        int count = 0, element = 0;
        for (int num : nums) {
            if (count == 0) {
                count=1;
                element = num;
            }
            else if (element == num) {
                count++;
            }
            else{
                count--;
            }
        }
        int cnt = 0;
        for (int n : nums) {
            if (n == element) {
                cnt++;
            }
        }
        return cnt > nums.length / 2 ? element : -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }    
}


// With extra space
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Arrays_MajorityElement {
    public static int majorityElement(int[] nums){
        // Storing keys along with values into the map
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        map.forEach((k,v)->System.out.println(k+":"+v)); // just printing the map elements
        
        // Extracting the values from the map and check if it is greater than n/2
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }    
}
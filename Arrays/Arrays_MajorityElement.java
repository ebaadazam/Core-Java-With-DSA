// Without extra space
// Moore's Voting Algorithm
// class Arrays_MajorityElement {
//     public static int majorityElement(int[] nums){
//         int candidate=0;
//         int count=0;
//         for(int i=0; i<nums.length; i++){
//             if(count == 0){
//                 candidate = nums[i];
//             }
//             if(candidate == nums[i]){
//                 count++;
//             } else{
//                 count--;
//             }
//         }
//         return candidate;
//     }
//     public static void main(String[] args) {
//         int[] nums = {3, 2, 3};
//         System.out.println(majorityElement(nums));
//     }    
// }


// With extra space - Map
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

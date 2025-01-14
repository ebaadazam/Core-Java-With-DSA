// // Single Number, approach used is XOR Operator
class Arrays_SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums){
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 1, 2};
        System.out.println(singleNumber(nums));
    }
}


// another approach
// import java.util.HashSet;
// public class Arrays_SingleNumber {
//     public static int singleNumber(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             if (set.contains(num)) {
//                 set.remove(num);
//             } else {
//                 set.add(num);
//             }
//         }
//         // Only one element remains in the set
//         return set.iterator().next();
//     }
// }

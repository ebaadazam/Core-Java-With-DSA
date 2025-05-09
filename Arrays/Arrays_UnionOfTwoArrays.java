import java.util.HashSet;
import java.util.Set;

public class Arrays_UnionOfTwoArrays {
    public static Set<Integer> sample(int[] nums1, int[] nums2) {
        Set<Integer> uniqueElements = new HashSet<>(); //  set to store the unique elements
        // Add all elements from the first array
        for (int num : nums1) {
            uniqueElements.add(num);
        }
        // Add all elements from the second array
        for (int num : nums2) {
            uniqueElements.add(num);
        }
        return uniqueElements;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 3, 4, 5, 6, 7};
        System.out.println(sample(nums1, nums2));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_FindCommonInThreeArrays {
    public static List<Integer> findCommon(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> arr = new ArrayList<>();
        int i=0, j=0, k=0;
        while (i < nums1.length && j < nums2.length && k < nums3.length) {
            if (nums1[i] == nums2[j] && nums2[j] == nums3[k]) {
                arr.add(nums1[i]);
                i++; j++; k++;
            } 
            else if (nums1[i] < nums2[j]) { i++; } 
            else if (nums2[j] < nums3[k]) { j++; }
            else { k++; }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 10, 20, 40, 80};
        int[] nums2 = {6, 7, 20, 80, 100};
        int[] nums3 = {3, 4, 15, 20, 30, 70, 80, 120};
        List<Integer> result = findCommon(nums1, nums2, nums3);
        System.out.println(result);
    }
}

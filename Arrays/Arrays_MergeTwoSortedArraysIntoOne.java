import java.util.Arrays;

public class Arrays_MergeTwoSortedArraysIntoOne {
    private static int[] sample(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        int[] result = new int[nums1.length + nums2.length];
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++; k++;
            } else if (nums1[i] > nums2[j]) {
                result[k] = nums2[j];
                j++; k++;
            } else{
                result[k] = nums1[i];
                i++; j++; k++;
            }
        }
        while (i < nums1.length) {
            result[k] = nums1[i];
            i++; k++;
        }
        while (j < nums2.length) {
            result[k] = nums2[j];
            j++; k++;
        }
        return Arrays.copyOf(result, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {4, 5, 6, 7};
        int[] res = sample(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}

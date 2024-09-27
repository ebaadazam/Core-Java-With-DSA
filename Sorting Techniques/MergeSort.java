import java.util.ArrayList;
import java.util.List;
class MergeSort {
    private static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        // Find middle
        int mid = (left + right) / 2;

        // Recursively calling left and right part of the array
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        // Merging both the sorted parts
        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;

        List<Integer> arr = new ArrayList<>();
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                arr.add(nums[i]);
                i++;
            } else{
                arr.add(nums[j]);
                j++;
            }
        }

        // Remaining Elements
        while (i <= mid) {
            arr.add(nums[i]);
            i++;
        }
        while (j <= right) {
            arr.add(nums[j]);
            j++;
        }

        // Copying sorted arr elements back to nums
        for (int k = 0; k < arr.size(); k++) {
            nums[left + k] = arr.get(k);
        }
    }
    public static void main(String[] args) {
        int nums[] = {5, 2, 1, 3, 1, 2, 4, 8, 7};

        // Array before mergeSort
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        } System.out.println();

        mergeSort(nums, 0, nums.length-1);

        // Array after mergeSort
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaPractice {
    public static void sort(int[] nums, int l, int r){
        if (l >= r) {
            return;
        }
        int mid = (l + r)/2;
        sort(nums, l, mid);
        sort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }

    public static void merge(int[] nums, int l, int mid, int r){
        int i = l;
        int j = mid+1;
        List<Integer> arr = new ArrayList<>();
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                arr.add(nums[i]);
                i++;
            } else {
                arr.add(nums[j]);
                j++;
            }
        }
        while (i <= mid) {
            arr.add(nums[i]);
            i++;
        }
        while (j <= r) {
            arr.add(nums[j]);
            j++;
        }

        for (int k = 0; k < arr.size(); k++) {
            nums[l+k] = arr.get(k);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 6, 1, 0, 2, 9, 8};
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }    
}
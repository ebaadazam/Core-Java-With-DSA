// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;
// public class CoreJavaPractice {
//     public static void mergeSort(int[] nums, int left, int right) {
//         // base condition
//         if (left >= right) { return; }
//         int mid = (left+right)/2;
//         mergeSort(nums, left, mid);
//         mergeSort(nums, mid+1, right);
//         merge(nums, left, mid, right); }
//     public static void merge(int[] nums, int left, int mid, int right) {
//         int i = left, j = mid+1;
//         List<Integer> arr = new ArrayList<>();
//         while (i <= mid && j <= right) {
//             if (nums[i] <= nums[j]) { arr.add(nums[i]); i++; }
//             else if (nums[j] < nums[i]) { arr.add(nums[j]); j++; } }
//         while (i <= mid) { arr.add(nums[i]); i++; }
//         while (j <= right) { arr.add(nums[j]); j++; }
//         for (int k = 0; k < arr.size(); k++) {
//             nums[left+k] = arr.get(k); } }
//     public static void main(String[] args) {
//         int[] nums = {5, 2, 7, 12, 28, 15};
//         mergeSort(nums, 0, nums.length-1);
//         for (Integer i : nums) { System.out.print(i + " "); } System.out.println(); } }

import java.util.Arrays;
public class CoreJavaPractice {
    public static int[] sample(int[] nums) {
        int n = nums.length;
        int max=0, secMax=0, thirdMax=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                thirdMax = secMax;
                secMax = max;
                max = nums[i];
            }
            else if (nums[i] > secMax) {
                thirdMax = secMax;
                secMax = nums[i];
            }
            else if (nums[i] > thirdMax) {
                thirdMax=nums[i];
            }
        }
        return new int[]{max, secMax, thirdMax};
    }
    public static void main(String[] args) {
        int[] nums = {1222, 6, 34, 32, 76, 45, 320};
        int[] res = sample(nums);
        System.out.println("[Max, SecMax, ThirdMax]: " + Arrays.toString(res));
    }
}
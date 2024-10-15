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


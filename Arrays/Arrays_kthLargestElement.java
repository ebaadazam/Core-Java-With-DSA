import java.util.PriorityQueue;
// TC - O(n log k)  &  SC - O(k)
class Arrays_kthLargestElement {
    public static int kthLargest(int[] nums, int k) {
        // Min-heap to store the top k largest elements
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                // Remove the smallest element to keep only the k largest elements as 
                // queue.poll() will remove the first element
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] nums = {20, 15, 5, 30, 28};
        int k = 3;
        System.out.println(kthLargest(nums, k)); // output will be 20 as it is 3rd largest
    }
}
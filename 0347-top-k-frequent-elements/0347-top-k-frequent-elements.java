import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1 Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2 Max Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Step 3 Add all unique numbers
        for (int key : map.keySet()) {
            pq.offer(key);
        }

        // Step 4 Take first k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}
import java.util.Random;
class Solution {
    Random random = new Random();
    public int findKthLargest(int[] nums, int k) {
    int target = nums.length - k;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int pivot = nums[left + random.nextInt(right - left + 1)];
            int[] range = partition(nums, left, right, pivot);

            int start = range[0];
            int end = range[1];

            if (target < start) {
                right = start - 1;

            } else if (target > end) {
                left = end + 1;

            } else {
                return nums[target];
            }
        }
        return -1;
    }
    private int[] partition(int[] nums, int left, int right, int pivot) {

        int smaller = left;
        int current = left;
        int greater = right;

        while (current <= greater) {
            if (nums[current] < pivot) {
                swap(nums, smaller, current);
                smaller++;
                current++;
            } else if (nums[current] > pivot) {
                swap(nums, current, greater);
                greater--;
            } else {
                current++;
            }
        }
        return new int[]{smaller, greater};
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
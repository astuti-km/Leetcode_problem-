class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }
        for (int x : nums2) {
            set2.add(x);
        }
        for (int x : nums3) {
            set3.add(x);
        }
        for (int x : set1) {
            int count = 0;
            if (set1.contains(x)) {
                count++;
            }
            if (set2.contains(x)) {
                count++;
            }
            if (set3.contains(x)) {
                count++;
            }
            if (count >= 2) {
                result.add(x);
            }
        }
        for (int x : set2) {
            int count = 0;
            if (set1.contains(x)) {
                count++;
            }
            if (set2.contains(x)) {
                count++;
            }
            if (set3.contains(x)) {
                count++;
            }
            if (count >= 2 && !result.contains(x)) {
                result.add(x);
            }
        }
        for (int x : set3) {
            int count = 0;

            if (set1.contains(x)) {
                count++;
            }
            if (set2.contains(x)) {
                count++;
            }
            if (set3.contains(x)) {
                count++;
            }
            if (count >= 2 && !result.contains(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
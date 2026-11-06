class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] freq=new int[30001];
         //Step 1:Count frequency
        for (int p:people) {
            freq[p]++;
        }
        // Step 2: Two pointers
        int left=1;
        int right=30000;
        int boat=0;

        while (left<=right) {
            while (left<=right && freq[left]==0) {
                left++;
            }
            while (left<=right && freq[right]==0) {
                right--;
            }
            if (left>right)
             break;
            // Step 3: Pair lightest and heaviest
            if (left+right<=limit && (left<right || freq[left]>=2)) {
                freq[left]--;
            }
            freq[right]--;
            boat++;
        }
        return boat;
    }
}
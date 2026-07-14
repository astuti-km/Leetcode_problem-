class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        int length = 0;
        boolean oddFound = false;
        // Calculate palindrome length
        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }
        // One odd character can be placed in the center
        if (oddFound) {
            length++;
        }
        return length;
    }
}
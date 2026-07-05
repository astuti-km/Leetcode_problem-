class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        for(int i=0;i<256;i++){
            hash[i]-=1;
        }
        int left = 0;
        int maxLen = 0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(hash[ch] >= left){
                left = hash[ch] + 1;
            }
            hash[ch]=right;
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxfreq=0;
        int maxlength=0;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq, freq[ch-'A']);

            while((i-left+1)-maxfreq>k) {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength, i-left+1);
        }
        return maxlength;
    }
}
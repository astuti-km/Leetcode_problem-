class Solution {
    public int countCommas(int n) {
        int count = 0;
        for (int i=1; i<=n;i++) {
            if (i>=1000 && i<1000000) {
                count+=1;
            } 
            else if (i>=1000000 && i<1000000000) {
                count += 2;
            } 
            else if (i>=1000000000) {
                count += 3;
            }
        }
        return count;
    }
}
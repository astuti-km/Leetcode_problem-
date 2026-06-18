class Solution {
    public double angleClock(int hour, int minutes) {
       double hourAngle=(hour%12)*30 + minutes*0.5;
        double minuteAngle = minutes*6;
        double angle=Math.abs(hourAngle-minuteAngle);
    
    return Math.min(angle,360-angle); 
    }
}

class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}

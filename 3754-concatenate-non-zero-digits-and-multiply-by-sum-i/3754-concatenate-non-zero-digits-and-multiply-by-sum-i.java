class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        long len = 1;
        while(n != 0){
            int digit = n%10;
            if(digit != 0){
                x = digit * len + x;
                len = len*10;
                sum+=digit;
            }
            n/=10;
        }
        return sum * x;
    }
}
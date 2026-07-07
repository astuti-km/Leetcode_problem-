class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder s = new StringBuilder();

        while(n>0){
            int m=n%10;
            if(m!=0){
                s.append(m);
            }
            n/=10;
        }
        if(s.length() == 0){
            return 0;
        }
        s.reverse();
        long x = Long.parseLong(s.toString());
        long sum = 0;
        long temp = x;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return x*sum;
    }
}
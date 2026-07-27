class Solution {
    public int trailingZeroes(int n){
        int count = 0;
        int pow =5;
        while(pow<=n){
            count+=n/pow;
            pow =pow * 5;
        }
    return count;
    }
}
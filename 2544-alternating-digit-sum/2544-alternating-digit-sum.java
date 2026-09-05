class Solution {
    public int alternateDigitSum(int n) {
    int cnt=0;
    int p=n;
    while(p>0){
        cnt++;
        p/=10;
    }
    int sum=0;
    boolean pt=cnt%2!=0;
    while(n>0){
        int d=n%10;
        if(pt){
            sum+=d;
        }
        else {
            sum-=d;
        }
    pt =! pt;
    n/=10;
    }
    return sum;
    }
}

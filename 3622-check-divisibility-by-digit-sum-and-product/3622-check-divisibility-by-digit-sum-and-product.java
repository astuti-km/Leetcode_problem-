class Solution {
    public boolean checkDivisibility(int n) {
        int original =n;
        int sum=0;
        int prod=1;
        while(n>0){
            int p=n%10;
            sum+=p;
            prod*=p;
            n/=10;
        }
        int total=sum+prod;

        return (original%total==0);
    }   
}
class Solution {
    boolean notZero(int p){
        while(p>0){ 
        if(p%10==0){
            return false;
        }
        p=p/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<=n-1;a++){
           int b=n-a;
           if(notZero(a) && notZero(b)){
            return new int[]{a,b};
           }
        }
        return new int[]{-1,-1};
    }
}
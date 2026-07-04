class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;
        for(int i=0;i<flowerbed.length && total<n;i++){
            if(flowerbed[i]==0){
                int prev;
                if(i==0){
                    prev=0;
                }
                else { 
                   prev = flowerbed[i-1];
                }

                int next;
                if(i==flowerbed.length-1){
                    next=0;
                }
                else {
                    next = flowerbed[i+1];
                }
                if(prev==0 && next==0){
                    flowerbed[i]=1;
                    total++;
                }
            }
        }
        if(total==n){
            return true;
        }
        else {
            return false;
        }
    }
}
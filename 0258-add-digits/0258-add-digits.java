class Solution {
    int sum=0;
        int countOfDigit(int num){
        int cnt = 0;
        sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
            cnt++;
        }
        return cnt;
        }
        public int addDigits(int num) {
        
        while(countOfDigit(num)>1){
            num=sum;
        }
        return sum;
    }
}
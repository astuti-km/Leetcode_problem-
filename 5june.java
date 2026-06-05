class Solution {
    public double myPow(double x, int n) {
        double ans =1.0;
        long num=n;
        if(num<0)
        num=-1*num;
        while(num>0){
            if(num%2==1){
                ans = ans * x;
                num = num - 1;
            }
            else {
                x = x * x;
                num = num / 2;
            }
        }
        if(n < 0)
        ans = (double)(1.0)/(double)(ans);
        return ans;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n * m - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int value = matrix[mid / m][mid % m];

            if (value == target) {
                return true;
            } 
            else if (value < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}


class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int maj=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
        
        if(count==0){ 
        maj=num;}

        if(num==maj){
            count++;}
            else {
                count--;
        }
        }
        return maj;
    }
}

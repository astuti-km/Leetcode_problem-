class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        int result=0;
        for(int i=n-1;i>=0;i-=3){
            result+=cost[i];
        
        if(i-1>=0){
            result+=cost[i-1];
                }
                
        }
        return result;
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
       int ind=-1;
       int n=nums.length;
       for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            ind=i;
            break;
        }
       } 
       if (ind == -1) {
            rev(nums, 0, n - 1);
            return;
        }
       
       for(int i=n-1;i>=ind;i--){
        if(nums[i]>nums[ind]){
            Swap(nums,i,ind);
            break;
        }
       }
       rev(nums,ind+1,n-1);
    }
        public void Swap(int nums[],int i,int j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
       public void rev(int nums[],int s,int e){
        while(s<e){
            Swap(nums,s,e);
            s++;
            e--;
        }
       }
    }

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String ans[]=new String[numRows];
        for(int i=0;i<numRows;i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int indx=0;indx<numRows && i<s.length();indx++){
                ans[indx]+=s.charAt(i++);
            }
            for(int indx=numRows-2;indx>0 && i<s.length();indx--){
                ans[indx]+=s.charAt(i++);
            }
        }
        String result = "";
        for(int j = 0; j < numRows; j++){
            result += ans[j];
        }
        return result;
    }
}
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            int n=Integer.valueOf(num.charAt(i));
            if((n&1)!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
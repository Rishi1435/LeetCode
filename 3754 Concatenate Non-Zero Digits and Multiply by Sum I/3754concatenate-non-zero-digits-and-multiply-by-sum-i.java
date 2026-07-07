class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum=0;
        String str=String.valueOf(n);
        for(char ch:str.toCharArray()){
            if(ch!='0'){
                int d=ch-'0';
                x=x*10+d;
                sum=sum+d;
            }
        }
        return (long)sum*x;
    }
}
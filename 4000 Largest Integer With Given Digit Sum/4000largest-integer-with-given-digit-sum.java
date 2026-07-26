class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n ||s<0){
            return -1;
        }
        if(s==0){
            return 0;
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int d=9;d>=0;d--){
                int rD=n-1-i;
                int rS=s-d;
                if(rS>=0 && rS<= 9*rD){
                    res=res*10+d;
                    s-=d;
                    break;
                }
            }
        }
        return res;
    }
}
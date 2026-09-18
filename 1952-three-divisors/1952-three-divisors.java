class Solution {
    public boolean isThree(int n) {
        int count=0;
        int sq=(int)Math.sqrt(n);
        for(int i=2;i<=sq;i++){
            while(n%i==0){
                n=n/i;
                count++;
            }
                if(n==1){
                    count++;
                    break;
                }
        }
        if(count==3 && n<=1){
            return true;
        }
        return false;
    }
}
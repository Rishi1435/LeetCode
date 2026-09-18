class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int count=0;
        boolean[] sieves=new boolean[n+1];
        for(int i=0;i<=n;i++){
            sieves[i]=true;
        }
        sieves[0]=false;
        sieves[1]=false;
        int sq=(int) Math.sqrt(n);
        for(int p=2;p<=sq;p++){
            if(sieves[p]){
                for(int i=p*p;i<=n;i+=p){
                    sieves[i]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(sieves[i]){
                count++;
            }
        }
        return count;
    }
}
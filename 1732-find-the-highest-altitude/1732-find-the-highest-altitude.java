class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] prefixSum=new int[n+1];
        for(int i=1;i<=n;i++){
            prefixSum[i]=prefixSum[i-1]+gain[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            if(max<prefixSum[i]){
                max=prefixSum[i];
            }
        }
        return max;
    }
}
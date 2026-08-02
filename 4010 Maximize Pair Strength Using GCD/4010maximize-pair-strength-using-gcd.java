class Solution {
    public long maxPairStrength(int[] nums) {
        int n=nums.length;
        long gcd;
        long maxPair=0;
        long ans;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                gcd=(long)findGCD(nums[i],nums[j]);
                ans=((long) nums[i] * nums[j]) / ((long) gcd*gcd);
                maxPair=Math.max(ans,maxPair);
            }
        }
        return maxPair;
    }
    static int findGCD(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        int max=0;
        for(int j:nums){
            freq[j]++;
            if(max<freq[j]){
                max=freq[j];
            }
        }
        int res=0;
        for(int f:freq){
            if(f==max){
                res=res+f;
            }
        }
        return res;
        
    }
}
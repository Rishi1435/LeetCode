class Solution {
    public int maxSubArray(int[] nums) {
        int current=nums[0];
        int maximum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            current=Math.max(nums[i],current+nums[i]);
            maximum=Math.max(current,maximum);
        }
        return maximum;
    }
}
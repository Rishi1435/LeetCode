class Solution {
    public int jump(int[] nums) {
        int l=0;
        int r=0;
        int count=0;
        while(r<nums.length-1){
            int far=0;
            for(int i=l;i<=r;i++){
                far=Math.max(far,nums[i]+i);
            }
            count++;
            l=r+1;
            r=far;
        }
        return count;
    }
}
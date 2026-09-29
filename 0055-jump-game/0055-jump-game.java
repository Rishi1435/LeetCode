class Solution {
    public boolean canJump(int[] nums) {
        int maxFind=0;
        int find=0;
        for(int i=0;i<nums.length;i++){
            if(maxFind<i){
                return false;
            }
            find=nums[i]+i;
            maxFind=Math.max(find,maxFind);
        }
        return true;
    }
}
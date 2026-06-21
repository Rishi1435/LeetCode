class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean found=false;
        int index=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                found=true;
                index=i;
            }
        }
        if(!found && nums[n-1]<target){
            index=n;
        }
        if(!found){
            for(int i=0;i<n-1;i++){
                if(nums[i]<target && nums[i+1]>target){
                    index=i+1;
                }
            }
        }
        return index;
    }
}
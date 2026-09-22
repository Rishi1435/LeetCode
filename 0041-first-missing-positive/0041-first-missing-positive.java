class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int target=1;
        for(int num:nums){
            if(num>0 && num==target){
                target++;
            }else if(num>target){
                return target;
            }
        }
        return target;
    }
}
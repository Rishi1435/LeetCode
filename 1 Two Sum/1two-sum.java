class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> index = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(index.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=index.get(target-nums[i]);
            }
            index.put(nums[i],i);
        }
        return ans;
    }
}
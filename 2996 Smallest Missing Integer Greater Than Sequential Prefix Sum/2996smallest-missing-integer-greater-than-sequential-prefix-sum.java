class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int j:nums){
            set.add(j);
        }
        int ele=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            ele=ele+nums[i];
        }
        while(set.contains(ele)) ele++;
        return ele;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.parallelSort(nums);
        int n=nums.length;
        return nums[n/2];
    }
}
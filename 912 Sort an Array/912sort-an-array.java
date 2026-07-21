class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.parallelSort(nums);
        return nums;
    }
}
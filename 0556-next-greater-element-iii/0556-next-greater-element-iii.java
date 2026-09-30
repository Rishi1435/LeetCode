class Solution {
    public int nextGreaterElement(int n) {
        char[] nums=String.valueOf(n).toCharArray();
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i<0){
            return -1;
        }
        int j=nums.length-1;
        while(nums[j]<=nums[i]){
            j--;
        }
        char temp1=nums[j];
        nums[j]=nums[i];
        nums[i]=temp1;

        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            char temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        long result=Long.parseLong(new String(nums));
        if(result>Integer.MAX_VALUE){
            return -1;
        }
        return (int)result;
    }
}
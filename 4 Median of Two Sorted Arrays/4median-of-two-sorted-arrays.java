class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length+nums2.length;
        int[] nums=new int[m];
        for(int i=0;i<nums1.length;i++){
            nums[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            nums[nums1.length+j]=nums2[j];
        }
        Arrays.sort(nums);
        double median;
        if(m%2==0){
            median=(nums[m/2]+nums[(m/2)-1])/2.0;
        }
        else{
            median=(nums[m/2]);
        }
        return median;
        
    }
}
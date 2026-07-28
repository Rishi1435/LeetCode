class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lmax=height[left];
        int rmax=height[right];
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                lmax=Math.max(lmax,height[left]);
                water+=lmax-height[left];
                left++;
            }
            else{
                rmax=Math.max(rmax,height[right]);
                water+=rmax-height[right];
                right--;
            }
        }
        return water;
    }
}
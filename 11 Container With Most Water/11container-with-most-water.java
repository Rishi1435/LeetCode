class Solution {
    public int maxArea(int[] height) {
        int min=Integer.MAX_VALUE;
        int maxArea=Integer.MIN_VALUE;
        int i=0,j=height.length-1;
        while(i<j){
            int len=j-i;
            if(height[i]<=height[j]){
                min=height[i];
                i++;
            }else if(height[i]>height[j]){
                min=height[j];
                j--;
            }
            maxArea=Math.max(maxArea,min*len);
        }
        return maxArea;
        
    }
}
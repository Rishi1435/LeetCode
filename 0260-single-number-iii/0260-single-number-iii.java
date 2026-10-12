class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor=xor^num;
        }
        int diffBit=xor & (-xor);
        int x=0,y=0;
        for(int num:nums){
            if((diffBit&num)==0){
                x=x^num;
            }
            else{
                y=y^num;
            }
        }
        return new int[]{x,y};
    }
}
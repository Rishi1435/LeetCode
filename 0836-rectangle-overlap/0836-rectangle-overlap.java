class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3];
        int xr1=rec2[0];
        int yr1=rec2[1];
        int xr2=rec2[2];
        int yr2=rec2[3];
        if(x1<xr2 && x2>xr1){
            if(y1<yr2 && y2>yr1){
                return true;
            }
        }
        return false;
    }
}
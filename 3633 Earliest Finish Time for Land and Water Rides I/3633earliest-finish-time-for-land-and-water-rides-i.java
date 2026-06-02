class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int land_ride=landStartTime[i]+landDuration[i];
                int ride=Math.max(land_ride,waterStartTime[j])+waterDuration[j];
                res=Math.min(ride,res);
                int water_ride=waterStartTime[j]+waterDuration[j];
                int wride=Math.max(water_ride,landStartTime[i])+landDuration[i];
                res=Math.min(res,wride);
            }
        }
        return res;
    }
}
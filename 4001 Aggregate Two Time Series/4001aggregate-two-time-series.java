class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> res=new ArrayList<>();
        int i =0,j=0;
        int n=series1.length;
        int m=series2.length;
        while(i<n || j<m){
            int currTimeStamp;
            if(i<n&&j<m){
                currTimeStamp=Math.min(series1[i][0],series2[j][0]);
            }
            else if(i<n){
                currTimeStamp=series1[i][0];
            }
            else{
                currTimeStamp=series2[j][0];
            }
            int val1=0;
            int val2=0;
            if(i<n && series1[i][0]==currTimeStamp){
                val1=series1[i][1];
            }
            else if(i<n){
                val1=series1[i][1];
            }
            else{
                val1=0;
            }
            if(j<m && series2[j][0]==currTimeStamp){
                val2=series2[j][1];
            }
            else if(j<m){
                val2=series2[j][1];
            }
            else{
                val2=0;
            }
            int aggreValue=val1+val2;
            res.add(Arrays.asList(currTimeStamp,aggreValue));
            if(i<n && series1[i][0]==currTimeStamp){
                i++;
            }
            if(j<m && series2[j][0]==currTimeStamp){
                j++;
            }
        }
        return res;
    }
}
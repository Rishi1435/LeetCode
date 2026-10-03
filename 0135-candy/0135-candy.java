class Solution {
    public int candy(int[] ratings) {
        int sum=0;
        int n=ratings.length;
        int[] leftarr=new int[n];
        int[] rightarr=new int[n];
        leftarr[0]=1;
        rightarr[n-1]=1;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                leftarr[i]=leftarr[i-1]+1;
            }
            else{
                leftarr[i]=1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                rightarr[i]=rightarr[i+1]+1;
            }
            else{
                rightarr[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            sum+=Math.max(leftarr[i],rightarr[i]);
        }
        return sum;
    }
}
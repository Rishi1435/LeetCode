class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int fiveCount=0;
        int tenCount=0;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                fiveCount++;
            }
            else if(bills[i]==10){
                if(fiveCount>0){
                    tenCount++;
                    fiveCount--;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(tenCount>0 && fiveCount>0){
                    tenCount--;
                    fiveCount--;
                }
                else if(fiveCount>=3){
                    fiveCount-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}
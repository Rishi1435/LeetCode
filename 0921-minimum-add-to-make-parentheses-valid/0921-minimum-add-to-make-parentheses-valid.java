class Solution {
    public int minAddToMakeValid(String s) {
        int openBracs=0;
        int closedBracs=0;
        for(char ch: s.toCharArray()){
            if(ch==')' && openBracs>0){
                openBracs--;
            }else if(ch==')' && openBracs==0){
                closedBracs++;
            }else{
                openBracs++;
            }
        }
        return closedBracs+openBracs;
    }
}
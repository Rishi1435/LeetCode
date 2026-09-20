class Solution {
    public int reverseDegree(String s) {
        int product=0;
        int i=1;
        for(char ch: s.toCharArray()){
            int index=ch-'0'-48;
            int revIndex=27-index;
            product+=(revIndex*i++);
        }
        return product;
    }
}
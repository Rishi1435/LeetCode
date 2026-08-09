class Solution {
    public int smallestNumber(int n, int t) {
        int prod=1;
        for(int i=n;i<n+10;i++){
            int temp=i;
            prod=1;
            while(temp!=0){
                prod=prod*(temp%10);
                temp=temp/10;
            }
            // System.out.println(prod+"%"+t+"="+(prod%t)+ " "+(prod%t==0));
            if(prod%t==0){
                return i;
            }
        }
        return 0;
    }
}
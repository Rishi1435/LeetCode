class Solution {
    public int reverse(int x) {
        int temp=x;
        long rev=0;
        int n;
        while(temp!=0){
            n=temp%10;
            temp=temp/10;
            rev=rev*10+n;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }
}
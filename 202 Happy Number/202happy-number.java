class Solution {
    public int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum=sum+(int)Math.pow(temp,2);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=sumOfDigits(slow);
            fast=sumOfDigits(sumOfDigits(fast));
        }
        while(slow!=fast);
        return slow==1;
    }
}
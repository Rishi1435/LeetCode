class Solution {
    public int totalWaviness(int num1, int num2) {
        int waviness=0;
        if(num2<100){
            return 0;
        }
        for(int n=num1;n<=num2;n++){
            String s=String.valueOf(n);
            for(int i=1;i<s.length()-1;i++){
                char prev=s.charAt(i-1);
                char curr=s.charAt(i);
                char next=s.charAt(i+1);
                if((curr>prev && curr>next) || (curr<prev && curr<next)){
                    waviness++;
                }
            }
        }
        return waviness;
    }
}
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] balloon=new int[5];
        int instance=0;
        for(char ch:text.toCharArray()){
            if(ch=='b'){
                balloon[0]++;
            }
            else if(ch=='a'){
                balloon[1]++;
            }
            else if(ch=='l'){
                balloon[2]++;
            }
            else if(ch=='o'){
                balloon[3]++;
            }
            else if(ch=='n'){
                balloon[4]++;
            }
        }
        balloon[2]/=2;
        balloon[3]/=2;
        return Math.min(
            Math.min(balloon[0],balloon[1]),
            Math.min(Math.min(balloon[2],balloon[3]),balloon[4]));
    }
}
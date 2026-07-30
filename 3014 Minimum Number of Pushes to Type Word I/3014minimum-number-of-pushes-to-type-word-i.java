class Solution {
    public int minimumPushes(String word) {
        int pushes=0;
        if(word.length()<=8){
            pushes=word.length();
        }
        else if(word.length()>8 && word.length()<=16){
            pushes=8+((word.length()-8)*2);
        }
        else if(word.length()>16 && word.length()<=26){
            int remaining=word.length()-16;
            int ThirdSet=remaining<=8?remaining:remaining-(remaining%8);
            int FourthSet= remaining<=8?0:remaining-8;
            pushes=8+16+(ThirdSet*3)+(FourthSet*4);
        }
        return pushes;
    }
}
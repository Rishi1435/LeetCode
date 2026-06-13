class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String word: words){
            int sum=0;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                sum+=weights[ch-'a'];
            }
            int remainder=sum%26;
            char letter=(char) ('z'-remainder);
            res.append(letter);
        }
        return res.toString();
    }
}
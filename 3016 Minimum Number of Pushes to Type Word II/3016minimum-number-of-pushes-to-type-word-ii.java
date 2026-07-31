class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            int i=ch-'a';
            freq[i]++;
        }
        Arrays.parallelSort(freq);
        int pushes=0;
        int cost=1;
        int count=0;
        for(int i=25;i>=0 && freq[i]>0;i--){
            pushes+=freq[i]*cost;
            count++;
            if(count%8==0){
                cost++;
            }
        }
        return pushes;
    }
}
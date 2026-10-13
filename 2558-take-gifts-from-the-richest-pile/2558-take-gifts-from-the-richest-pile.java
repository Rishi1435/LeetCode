class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int gift:gifts){
            queue.offer(gift);
        }
        while(k-- >0){
            double sq=Math.floor(Math.sqrt((double)queue.poll()));
            queue.offer((int) sq);
        }
        while(!queue.isEmpty()){
            sum+=queue.poll();
        }
        return sum;
    }
}
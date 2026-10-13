class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            queue.offer(stones[i]);
        }
        while(queue.size()>1){
            int x=queue.remove();
            int y=queue.remove();
            if(x==y){
                continue;
            }
            if(x!=y){
                int z=x-y;
                queue.add(z);
            }
        }
        int result=queue.isEmpty()?0:queue.remove();
        return result;
    }
}
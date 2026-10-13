class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        int result=0;
        for(int num:nums){
            queue.offer(num);
        }
        while(k-- >0){
            result=queue.poll();
        }
        return result;
    }
}
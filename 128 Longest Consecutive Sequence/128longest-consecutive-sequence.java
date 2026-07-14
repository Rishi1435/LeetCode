class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int n:nums ){
            set.add(n);
        }
        int count=0;
        for(int s:set){
            if(!set.contains(s-1)){
                int curr=s;
                int consecutive=1;
                while(set.contains(curr+1)){
                    curr++;
                    consecutive++;
                }
            count=Math.max(count, consecutive);
            }
        }
        return count;
    }
}
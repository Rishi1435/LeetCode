class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1=0;
        int index2=1;
        int n=numbers.length;
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(numbers[i],i);
        }
        for(int i=0;i<n;i++){
            int val=target-numbers[i];
            index1=i;
            if(map.containsKey(val)){
                index2=map.get(val);
                break;
            }
        }
        res[0]=index1+1;
        res[1]=index2+1;
        return res; 
    }
}
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        List<Integer> temp=new ArrayList<>();
        backtrack(result,used,temp,nums);
        return result;
    }
    private void backtrack(List<List<Integer>> result,boolean[] used,List<Integer> temp,int[] arr){
        if(temp.size()==arr.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]) continue;
            if(i>0 && arr[i]==arr[i-1] && !used[i-1]) continue;
            used[i]=true;
            temp.add(arr[i]);
            backtrack(result,used,temp,arr);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}
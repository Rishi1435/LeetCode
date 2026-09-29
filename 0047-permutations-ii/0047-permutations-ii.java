class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> indices=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(result,temp,indices,nums);
        return result;
    }
    private void backtrack(List<List<Integer>> result,List<Integer> indices,List<Integer> temp,int[] arr){
        if(temp.size()==arr.length){
            if(result.contains(temp)){
                return;
            }
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(indices.contains(i)) continue;
            temp.add(arr[i]);
            indices.add(i);
            backtrack(result,indices,temp,arr);
            temp.remove(temp.size()-1);
            indices.remove(indices.size()-1);
        }
    }
}
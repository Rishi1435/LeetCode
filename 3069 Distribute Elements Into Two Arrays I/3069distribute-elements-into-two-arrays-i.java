class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        int[] result=new int [n];
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int left=0,right=0;
        for(int i=2;i<n;i++){
            if(arr1.get(left)>arr2.get(right)){
                arr1.add(nums[i]);
                left++;
            }else{
                arr2.add(nums[i]);
                right++;
            }
        }
        int k=0;
        for(int j:arr1){
            result[k++]=j;
        }
        for(int j:arr2){
            result[k++]=j;
        }
        return result;
    }
}
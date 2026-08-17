class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int minBoatCount=0;
        Arrays.sort(people);
        int j=people.length-1;
        int i=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            minBoatCount++;
            j--;
        }
        return minBoatCount;
    }
}

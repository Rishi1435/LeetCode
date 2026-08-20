class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int timeTaken=0;
        int floor=0;
        int totalTime=0;
        for(int i=0;i<requests.length;i++){
            timeTaken=Math.abs(floor-requests[i]);
            floor=requests[i];
            totalTime=totalTime+timeTaken;
        }
        return totalTime;
    }
}
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minDistance=Integer.MAX_VALUE;
        int minIndex=-1;
        for(int i=0;i<drones.length;i++){
            int travelDistance=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(travelDistance<=drones[i][2]){
                if(travelDistance<minDistance){
                    minDistance=travelDistance;
                    minIndex=i;
                }
            }
        }
        return minIndex;
    }
}
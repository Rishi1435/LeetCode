class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int waterDrank=numBottles;
        while(numBottles>=numExchange){ 
            int exchangedBottles=numBottles/numExchange;
            int emptyBottles=exchangedBottles+(numBottles%numExchange);
            waterDrank+=exchangedBottles;
            numBottles=emptyBottles;
        }
        return waterDrank;
        
    }
}
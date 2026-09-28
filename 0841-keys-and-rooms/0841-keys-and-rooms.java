class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(0,rooms,visited);
        for(boolean visit:visited){
            if(!visit){
                return false;
            }
        }
        return true;
    }
    private void dfs(int node,List<List<Integer>> graph,boolean[] visited){
        visited[node]=true;
        for(int neighbour:graph.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,graph,visited);
            }
        }
    }
}
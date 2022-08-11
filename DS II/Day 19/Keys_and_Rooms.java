class Solution {
    public static int countOfVisitedRooms = 0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int numberOfRooms = rooms.size();
        countOfVisitedRooms = 0;
        boolean[] visited = new boolean[numberOfRooms];
        traverseRoom(rooms,0,visited);  
        return countOfVisitedRooms == numberOfRooms;
    }
    
    public void traverseRoom(List<List<Integer>> rooms,int roomId,boolean[] visited) {
        if(roomId<0 || roomId>=rooms.size())
            return;
        visited[roomId] = true;
        countOfVisitedRooms++;
        for(int key : rooms.get(roomId)) {
            if(!visited[key]) {
                traverseRoom(rooms,key,visited);
            }
        }
    }
}
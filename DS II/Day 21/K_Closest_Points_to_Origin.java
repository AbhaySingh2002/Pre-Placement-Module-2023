class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<int[]>((a,b)->(a[2]-b[2]));
        for (int[] point:points){
            int x = point[0], y = point[1], distanceSquare = x*x+y*y;
            q.offer(new int[]{x,y,distanceSquare});
        }
        
        int[][] result = new int[k][2];
        for (int[] resPoint:result) {
            var point = q.poll();
            resPoint[0]=point[0];
            resPoint[1]=point[1];
        }
        return result;
    }
}
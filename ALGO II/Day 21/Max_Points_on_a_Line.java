class Solution {
    public int maxPoints(int[][] points) {
        int max = 0;
        for(int i = 0; i < points.length; ++i){
            int vertical = 0;
            int horizontal = 0;
            HashMap<Double,Integer> map = new HashMap();
            for(int j = 0; j<points.length; ++j){
                if(i != j){
                    if(points[i][0] == points[j][0]){
                        vertical++;
                        max = Math.max(vertical,max);
                    }
                    else if(points[i][1] == points[j][1]){
                        horizontal++;
                        max = Math.max(horizontal,max);
                    }
                    else{
                    double gradient = (points[i][1] - points[j][1])*1.00/(points[i][0] - points[j][0]); 
                    max = Math.max(max,map.getOrDefault(gradient,0)+1);
                    map.put(gradient,map.getOrDefault(gradient,0)+1);}
                }
            }
        }
        
        return max + 1;
    }
    
}
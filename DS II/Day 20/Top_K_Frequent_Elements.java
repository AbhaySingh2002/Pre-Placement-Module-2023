class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       
        Map<Integer, Integer> map = new HashMap<>();
    
        for(int n : nums)
            map.put(n, map.getOrDefault(n,0)+1);
        
        
       
        PriorityQueue<Pair<Integer,Integer>> q = new PriorityQueue<>( new Comparator<Pair<Integer,Integer>>(){
            
            public int compare(Pair<Integer,Integer> p1, Pair<Integer,Integer> p2)
            {
                return p1.getValue() - p2.getValue();
            }
            
        });
        
       
        for(Integer key : map.keySet())
        {
            q.add(new Pair( key, map.get(key) ) );
            if(q.size() > k ) q.poll();
        }
        
        int[] ans = new int[k];
        int i=0;
        while(!q.isEmpty())
            ans[i++] = q.poll().getKey();
        
        return ans;
    }
}
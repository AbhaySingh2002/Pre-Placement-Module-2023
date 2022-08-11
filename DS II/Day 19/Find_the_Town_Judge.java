class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] t = new int[n+1];
        boolean[] v = new boolean[n+1];
        for(int[] arr : trust){
            v[arr[0]]=true;
            t[arr[1]]++;
        }
        for(int i=1;i<n+1;i++){
            if(t[i]==n-1){
                if(!v[i]) return i;
            }
        }
        return -1;
    }
}
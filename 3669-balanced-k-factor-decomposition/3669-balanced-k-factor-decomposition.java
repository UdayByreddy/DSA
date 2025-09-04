class Solution {
    public int[] minDifference(int n, int k) {
        List<Integer> best = new ArrayList<>();
        backTrack(n,k,1,new ArrayList<>(),best);
        int[] res = new int[best.size()];
        for(int i=0;i<best.size();i++){
            res[i]=best.get(i);
        }
        return res;
    }
    public void backTrack(int n,int k,int start,List<Integer> cur,List<Integer> best){
        if(k==0){
            if(n==1){
                int max = Collections.max(cur);
                int min = Collections.min(cur);
                int dif = max-min;
                if(best.isEmpty() || dif<Collections.max(best)-Collections.min(best)){
                    best.clear();
                    best.addAll(new ArrayList<>(cur));
                }
            }
            return ;
        }

        for(int i=start;i<=n;i++){
            if(n%i==0){
                 cur.add(i);
                backTrack(n/i,k-1,i,cur,best);
                cur.remove(cur.size()-1);
            }
        }
    }
}
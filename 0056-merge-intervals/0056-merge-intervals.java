class Solution {
    // Merge Intervals
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        List<int[]> val = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(val.isEmpty() || val.get(val.size()-1)[1]<intervals[i][0]){
                val.add(intervals[i]);
            }
            else{
                int[] last = val.get(val.size()-1);
                last[1] = Math.max(last[1],intervals[i][1]); 
            }
        }
        return val.toArray(new int[val.size()][2]);

    }
}
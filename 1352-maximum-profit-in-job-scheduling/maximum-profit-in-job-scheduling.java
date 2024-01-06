class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int arr[][] = new int[startTime.length][3];
        for(int i=0; i<startTime.length; i++){
            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i]; 
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);  
        TreeMap<Integer,Integer> tMap = new TreeMap<>();   
        tMap.put(0,0);
        for(int i=0; i<startTime.length; i++){
            int curr = tMap.floorEntry(arr[i][0]).getValue()+arr[i][2];
            if(curr>tMap.lastEntry().getValue()){
                tMap.put(arr[i][1],curr);
            }

        }   
        return tMap.lastEntry().getValue();
    }
}
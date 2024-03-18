class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }else return Integer.compare(a[0],b[0]);
        });
        int res = 0;
        long prev = arr[0][1];
        for(int i=1; i<arr.length; i++){
            if(arr[i][0]<=prev){
                prev = Math.min(prev,arr[i][1]);
            }
            else{
                res++;
                prev = arr[i][1];
            }
        }
        return res+1;
        
    }
}
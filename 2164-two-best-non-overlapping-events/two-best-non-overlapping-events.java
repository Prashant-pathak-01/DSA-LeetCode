class Solution {
    public static int search(int arr[][], int i){
       // if(i==0) System.out.pritnln()
        int l = i+1;
        int r = arr.length-1;
        int res = -1;
        while(l<=r){
            int mid = (l+r+1)/2;
            if(arr[mid][0]>arr[i][1]) {
                res = mid;
                r = mid-1;
            }else l = mid+1;
        }
        return res;
    }
    public int maxTwoEvents(int[][] events) {
        int max= 0 ;
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        int prefix[] = new int[events.length];
        prefix[prefix.length-1] = events[events.length-1][2];
        for(int i=events.length-2; i>=0; i--) prefix[i] = Math.max(prefix[i+1],events[i][2]);
        //System.out.println(Arrays.toString(prefix));
        for(int i=0; i<events.length; i++){
            max = Math.max(events[i][2],max);
            int res = search(events,i);
               // System.out.println(i+" "+res+" "+events[i][2]+" ");
            if(res!=-1){
                max = Math.max(max,events[i][2]+prefix[res]);
            }
        }
        return max;

    }
}
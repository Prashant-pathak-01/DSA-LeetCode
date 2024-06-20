class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo = 1;
        int hi = (position[position.length-1]-position[0])/(m-1);
        int ans = 1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(check(position, mid, m))
            {
                ans = mid;
                lo=mid+1;
            }
            else
            {
                hi = mid-1;
            }
        }
        return ans;
    }
    private boolean check(int[] arr, int dist, int m)
    {
        int prev=1;
        int last = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-last>=dist)
            {
                prev++;
                last = arr[i];
            } 
            if(prev>=m)
            {
                return true;
            }
        }
        return false;
    }
}
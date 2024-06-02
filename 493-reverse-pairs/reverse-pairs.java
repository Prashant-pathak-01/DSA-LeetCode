class Solution {
    public int merge(int nums[], int mid, int i, int n){
        int res =0 ;
        int j = mid+1;
        int count = 0;
        int x = i;
        while(j<=n){
            while(x<=mid){
                if(nums[x]>(long)nums[j]*2) count++;
                else break;
                x++;
            }
            res+=count;
            j++;
        }
        j = mid+1;
        x = i;
        List<Integer> list = new ArrayList<>();
        while(i<=mid && j<=n ){
            if(nums[i]>=nums[j]) list.add(nums[i++]);
            else list.add(nums[j++]);
        }
        while(i<=mid) list.add(nums[i++]);
        while(j<=n) list.add(nums[j++]);
        for(int el:list) nums[x++] = el; 
        return res;
    }
    public int mergeSort(int nums[], int i, int n){
        if(i==n) return 0;
        int res = 0;
        int mid = (n+i)/2;
        res+=mergeSort(nums,i,mid);
        res+=mergeSort(nums,mid+1,n);
        res+=merge(nums,mid,i,n);
        return res;

    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}
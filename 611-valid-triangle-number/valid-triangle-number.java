class Solution {
    public int find(int arr[],int tar, int l, int r){
        int res = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]<tar){
                res = mid;
                l = mid+1;
            }else r = mid-1;
        }
        return res;
    }
    public int triangleNumber(int[] nums) {
        int res =0 ;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                int k = find(nums,nums[i]+nums[j],j+1, nums.length-1);
                if(k==-1) continue;
                res+=(k-j);
                //System.out.println(k-j+" "+i+" "+j);
            }
        }
        return res;
    }
}
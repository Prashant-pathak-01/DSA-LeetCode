class Solution {
    public int longestMountain(int[] arr) {
        int l[] = new int[arr.length];
        int r[] = new int[arr.length];
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]<arr[i]) l[i] = l[i-1]+1;
            else l[i] = 0;
        }
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i+1]<arr[i]) r[i] = r[i+1]+1;
            else r[i] = 0;
        }
        
        int res = 0;
        for(int i=1; i<arr.length-1; i++) if(l[i]>0 && r[i]>0) res = Math.max(res,l[i]+r[i]+1);
        return res;
    }
}
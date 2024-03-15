class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n];
        int res= 0;
        if(arr.length>=1) arr[0] = true;
        if(arr.length>=2) arr[1] = true;
        for(int i=2; i<Math.sqrt(n); i++){
            if(!arr[i]){
                for(int j=i*i; j<n; j+=i){
                    arr[j] = true;
                }
            }
        }
        for(boolean i:arr) if(!i) res++;
        return res;
    }
}
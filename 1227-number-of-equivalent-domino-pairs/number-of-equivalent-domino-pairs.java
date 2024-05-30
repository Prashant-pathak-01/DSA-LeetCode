class Solution {
    public int numEquivDominoPairs(int[][] arr) {
        int res= 0;
        for(int i=0; i<arr.length; i++) Arrays.sort(arr[i]);
        Arrays.sort(arr,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i][0]==arr[j][0] && arr[i][1]==arr[j][1]) res++;
                else break;
            }
        }
        return res;
    }
}
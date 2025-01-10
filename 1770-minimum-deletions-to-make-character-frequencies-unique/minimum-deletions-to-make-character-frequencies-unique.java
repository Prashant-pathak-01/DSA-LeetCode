class Solution {
    public int minDeletions(String s) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++) arr[s.charAt(i)-'a']++; 
        Arrays.sort(arr);
        int res =0;
        int prev =Integer.MAX_VALUE;
        //System.out.println(Arrays.toString(arr));
        for(int x=arr.length-1; x>=0; x--){
            if(arr[x]>0 && prev<arr[x]){
                res+=Math.min(arr[x],Math.abs(arr[x]-prev));
            }
            prev = Math.min(arr[x]-1,prev-1);
            //System.out.println(res);

        }
        return res;
    }
}
class Solution {
    public int minimumPushes(String word) {
        int arr[] = new int[26];
        for(int i=0; i<word.length(); i++) arr[(int)(word.charAt(i)-'a')]++; 
        Arrays.sort(arr);
        int r = 1;
        int count = 1;
        int ans= 0;
        for(int i=arr.length-1; i>=0; i--){
            if(r<9) r++;
            else {
                r=2;
                count++;
            }
            ans+=count*arr[i];
        } 
        return ans;
    }
}
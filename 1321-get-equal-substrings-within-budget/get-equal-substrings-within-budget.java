class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int arr[] = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = (int)Math.abs(s.charAt(i)-t.charAt(i));
        }
        int temp = 0;
        int res =0;
        int j = 0;
        for(int i=0; i<arr.length; i++){
                temp+=arr[i];
                while(temp>maxCost){
                    temp-=arr[j++];
                }
            res = Math.max(res,i-j+1);
        }
        return res;

    }
}
class Solution {
    public int minimumPushes(String word) {
        int res = 0;
        int arr[] = new int[26];
        for(int i=0; i<word.length(); i++){
            arr[word.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int count = 0;
        int a = 1;
        for(int i=arr.length-1; i>=0; i--){
            if(count<8) count++;
            else{
                a++;
                count = 1;
            }
            res+=a*arr[i];
        }
        return res;
    }
}
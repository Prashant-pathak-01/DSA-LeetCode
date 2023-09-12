class Solution {
    public int minDeletions(String s) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        
        int res = 0;
        boolean bool[] = new boolean[s.length()+1];

        for(int i= 0; i<26; i++){
            while(bool[arr[i]] && arr[i]>0){
                res++;
                arr[i]--;
            }  
            bool[arr[i]] = true;  
        }
        return res;

    }
}
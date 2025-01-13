class Solution {
    public int minimumLength(String s) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=2) res+=arr[i];
            else{
                if(arr[i]==3) res++;
                else{
                    if(arr[i]%2==0) res+=2;
                    else res+=1;
                }
            }
        }
        return res;
    }
}
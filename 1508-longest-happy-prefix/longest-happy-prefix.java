class Solution {
    public String longestPrefix(String s) {
        int arr[] = new int[s.length()];
        int j = 0;
        for(int i=1; i<s.length();){
            if(s.charAt(i)==s.charAt(j)){
                j++;
                arr[i++] = j;
            }else{
                if(j!=0){
                    j = arr[j-1];
                }else{
                    arr[i++] = j;
                }
            }
        }
        return s.substring(s.length()-arr[s.length()-1]);
    }
}
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder arr[] = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++) arr[i] = new StringBuilder();
        int k=0;
        while(k<s.length()){
            for(int i=0; i<numRows && k<s.length(); i++){
                arr[i].append(s.charAt(k++));
            }
            for(int i=numRows-2; i>0 && k<s.length(); i--){
                arr[i].append(s.charAt(k++));
            }
        } 
        StringBuilder res = new StringBuilder();
        for(int i=0; i<arr.length; i++) res.append(arr[i]);
        return res.toString();
    }
}
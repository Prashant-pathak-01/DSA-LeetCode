class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            StringBuilder temp = new StringBuilder();
            int size = Math.min(i+k,s.length());
            temp.append(s.substring(i,size));
            temp.reverse();
            res.append(temp);
            res.append(s.substring(size,Math.min(s.length(),size+k)));
            i+=2*k;
            i--;
        }
        return res.toString();
    }
}
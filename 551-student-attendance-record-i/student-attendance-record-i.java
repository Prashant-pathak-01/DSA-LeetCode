class Solution {
    public boolean checkRecord(String s) {
        int late = 0;
        boolean res = true;
        int absent = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A') {
                absent++;
                late = 0;
            }
            else if(s.charAt(i)=='L') late++;
            else late = 0;
            if(absent>=2 || late>=3) res = false;
        }
        return res;
    }
}
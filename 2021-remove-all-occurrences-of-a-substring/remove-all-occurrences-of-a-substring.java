class Solution {
    public String removeOccurrences(String s, String part) {
        boolean flag = true;
        while(flag){
            int i=0;
            flag = false;
            while(i<s.length()-part.length()+1){
                if(s.substring(i,i+part.length()).equals(part)) {
                    s = s.substring(0,i)+s.substring(i+part.length());
                    flag = true;
                    break;
                }
                i++;
            }
        }
        return s;
    }
}
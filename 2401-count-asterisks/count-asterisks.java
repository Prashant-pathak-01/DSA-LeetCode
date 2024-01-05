class Solution {
    public int countAsterisks(String s) {
        boolean temp = true;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='|') temp = !temp;
            if(temp==true && s.charAt(i)=='*') res++;
        }

        return res;
    }
}
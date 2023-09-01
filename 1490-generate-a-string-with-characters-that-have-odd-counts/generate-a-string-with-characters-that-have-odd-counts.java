class Solution {
    public String generateTheString(int n) {
        int s = n;
        String str = new String();
        if(n%2==0) {
            s = n-1;
            str = str.concat("x");
        } 
        for(int i=0 ; i<s; i++) {
            str = str.concat("p");
        }
        

        return str;
    }
}
class Solution {
    public boolean isPal(int n, int base){
        String temp = "";
        while (n > 0) {
        temp = temp+(n % base);
        n /= base;
        }
        int i=0;
        int j=temp.length()-1;
        while(i<j){
            if(temp.charAt(i++)!=temp.charAt(j--)) return false;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=n-2; i>=2; i--){
            if(!isPal(n,i)) return false;
        }
        return true;
    }
}
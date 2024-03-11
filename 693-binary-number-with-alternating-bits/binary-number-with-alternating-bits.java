class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        while(n!=0){
            int temp = n%2;
            n = n>>1;
            if(temp!=prev){
                prev = temp;
            }else return false;
        }
        return true;
    }
}
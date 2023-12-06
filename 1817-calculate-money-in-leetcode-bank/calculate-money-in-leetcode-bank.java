class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int res =  0;
        int temp = 28;
        while(weeks>0){
            res+=temp;
            temp+=7;
            weeks--;
        }
        temp = n%7;
        int days = (n/7)+1;
        while(temp>0){
            temp--;
            res+=days;
            days++;
        }
        return res;
    }
}
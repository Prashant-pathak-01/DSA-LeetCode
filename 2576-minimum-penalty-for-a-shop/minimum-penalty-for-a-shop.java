class Solution {
    public int bestClosingTime(String customers) {
        int res = 0;
        int penality = 0;
        int max = penality; 
        for(int i=0; i<customers.length(); i++){
            if(customers.charAt(i)=='Y') penality--;
            else penality++;
            if(penality<max){
                max  = penality;
                res = i+1;
            }
        }
        return res;
    }
}
class Solution {
    public int numberOfBeams(String[] bank) {
        int res =0;
        int prev = -1;
        for(int i=bank.length-1; i>=0; i--){
            int count = 0;
            for(int j=0; j<bank[i].length(); j++){
                if(bank[i].charAt(j)=='1') count++;
            }
            if(count ==0) continue;
            if(prev==-1) { prev = count; continue;}
            res+=(prev*count);
            prev =count;
            
        }
        
        return res;
    }
}
class Solution {
    public int numberOfBeams(String[] bank) {
        int res =0;
        List<Integer> list = new ArrayList<>();
        for(int i=bank.length-1; i>=0; i--){
            int count = 0;
            for(int j=0; j<bank[i].length(); j++){
                if(bank[i].charAt(j)=='1') count++;
            }
            if(count!=0) list.add(count);
        }
        for(int i=list.size()-1; i>=1; i--){
            res+=(list.get(i)*list.get(i-1));
        }
        return res;
    }
}
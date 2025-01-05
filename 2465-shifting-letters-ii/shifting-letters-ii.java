class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int value[] = new int[s.length()];
        for(int i=0; i<shifts.length; i++){
            if(shifts[i][2]==1){
                if(shifts[i][0]-1>=0) value[shifts[i][0]-1]--;
                value[shifts[i][1]]++;
            }else{
                if(shifts[i][0]-1>=0) value[shifts[i][0]-1]++;
                value[shifts[i][1]]--;
            }
        }
        // for(int i=0; i<s.length(); i++) value[i] = s.charAt(i)-'a';
        //System.out.println(Arrays.toString(value));
        StringBuilder res = new StringBuilder();
        int prev = 0;
        for(int i=value.length-1; i>=0; i--){
            int temp = s.charAt(i)-'a';
            prev+=value[i];
            temp+=prev;
            temp%=26;
            temp+=26;
            temp%=26;
            res.append((char)('a'+temp));
        }
        res.reverse();
        return res.toString();
    }
}
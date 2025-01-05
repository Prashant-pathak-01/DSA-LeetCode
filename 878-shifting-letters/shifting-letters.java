class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long totalShifts = 0;
        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1; i>=0;  i--){
            totalShifts+=shifts[i];
            long temp = s.charAt(i)-'a';
            temp+=totalShifts;
            temp%=26;
            res.append((char)('a'+temp));
        }
        res.reverse();

        return res.toString();
    }
}
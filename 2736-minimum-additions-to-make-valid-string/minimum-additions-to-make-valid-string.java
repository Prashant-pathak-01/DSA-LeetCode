class Solution {
    public int addMinimum(String word) {
        int res = 0;
        int i = 0;
        while (i < word.length()) {
            if (i+2<word.length() && word.charAt(i) == 'a' && word.charAt(i + 1) == 'b' && word.charAt(i + 2) == 'c')
                i += 3;
            else if (word.charAt(i) == 'a') {
                if (i+1<word.length() &&  word.charAt(i + 1) != 'a') {
                    i += 2;
                    res++;
                } else {
                    i++;
                    res += 2;
                }
            } else if (word.charAt(i) == 'b') {
                if (i+1==word.length() || word.charAt(i + 1) != 'c') {
                    i++;
                    res += 2;
                } else {
                    i += 2;
                    res++;
                }
            } else {
                res += 2;
                i++;
            }
        }
        return res;
    }
}
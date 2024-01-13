class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int ln = s.length();
        StringBuilder temp = new StringBuilder();
        int i= 0;
        while(i<words.length && temp.length()<ln) temp.append(words[i++]);
        return s.equals(temp.toString());
    }
}
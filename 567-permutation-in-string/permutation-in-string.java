class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char arr[] = s1.toCharArray();
        Arrays.sort(arr);
        s1 = String.valueOf(arr);
        for(int i=s1.length()-1; i<s2.length(); i++){
            String temp = s2.substring(i-s1.length()+1,i+1);
            char sub[] = temp.toCharArray();
            Arrays.sort(sub);
            String str = String.valueOf(sub);
            if(str.equals(s1)) return true;
        }
        return false;
    }
}
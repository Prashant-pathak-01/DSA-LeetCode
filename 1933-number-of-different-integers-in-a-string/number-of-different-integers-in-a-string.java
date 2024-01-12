class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            if(Character.isDigit(word.charAt(i))){
                StringBuilder temp = new StringBuilder();
                while(i<word.length() && Character.isDigit(word.charAt(i))){
                    if(temp.toString().equals("") && word.charAt(i)=='0') {
                        i++;
                        continue;}
                    temp.append(word.charAt(i));
                    i++;
                }
                set.add(temp.toString());
                i--;
            }
        }
        return set.size();

    }
}
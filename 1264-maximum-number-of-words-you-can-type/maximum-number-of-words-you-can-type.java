class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count =0 ;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<brokenLetters.length(); i++) set.add(brokenLetters.charAt(i));
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++) if(set.contains(arr[i].charAt(j))){
                count++;
                break;
            }
        }
        return arr.length-count;
    }
}
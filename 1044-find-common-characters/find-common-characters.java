class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        for(char i='a'; i<='z'; i++){
            int min = Integer.MAX_VALUE;
            for(String str:words){
                int count = 0;
                for(int j=0; j<str.length(); j++) if(str.charAt(j)==i) count++;
                min = Math.min(count,min);
            }
            for(int j=0; j<min; j++) list.add(String.valueOf(i));
        }
        return list;
    }
}
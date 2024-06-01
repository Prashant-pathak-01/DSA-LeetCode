class Solution {
    public String oddString(String[] words) {
        for(int i=0; i<words.length; i++){
            String strA = "";
            for(int x=0; x<words[i].length()-1; x++) strA = strA+(int)(words[i].charAt(x+1)-words[i].charAt(x))+" ";
            boolean flag = true;
            for(int j=0; j<words.length; j++){
                if(j==i) continue;
                String strB = "";
                for(int x=0; x<words[j].length()-1; x++) strB = strB+(int)(words[j].charAt(x+1)-words[j].charAt(x))+" ";
                if(strA.equals(strB)) {
                    flag = false;
                    break;
                }
            }
            if(flag) return words[i];
        }
        return words[words.length-1];
    }
}
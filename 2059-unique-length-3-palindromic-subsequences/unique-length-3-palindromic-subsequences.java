class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character,Set<Character>> map =new HashMap<>();
        Set<Character> set = new HashSet<>();
        int sum  = 0;
        for(int i=0; i<s.length(); i++){
            char temp1 = s.charAt(i);
            if(!set.contains(temp1)) {
                boolean flag = false;
                for(int j=s.length()-1; j>i; j--){
                    char temp2 = s.charAt(j);
                    if(flag){
                        map.get(temp1).add(temp2);
                    }
                    if(temp1==temp2 && j-i>=2){
                        flag = true;
                        if(!map.containsKey(temp1)) {
                        set.add(temp1);
                        map.put(temp1,new HashSet<>());
                        }
                    }   
                }
                if(map.containsKey(s.charAt(i))) sum+=map.get(s.charAt(i)).size();
            }
        }

        return sum;
    }
}
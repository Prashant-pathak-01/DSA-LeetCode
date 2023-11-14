class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character,Set<Character>> map =new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            boolean flag = false;
            if(set.contains(s.charAt(i))) continue;
            for(int j=s.length()-1; j>i; j--){
                if(flag){
                    map.get(s.charAt(i)).add(s.charAt(j));
                    
                }
                if(s.charAt(i)==s.charAt(j) && j-i>=2){
                    flag = true;
                    if(!map.containsKey(s.charAt(i))) {
                     set.add(s.charAt(i));
                     map.put(s.charAt(i),new HashSet<>());
                    }
                    
                }
                
            }
        }

        int sum  = 0;
        for(Map.Entry<Character,Set<Character>> entry : map.entrySet()){
            sum+=entry.getValue().size();
            System.out.println(entry.getValue());
        }
        return sum;
    }
}
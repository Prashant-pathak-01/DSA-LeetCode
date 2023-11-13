class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }

        Collections.sort(list);
        StringBuilder res = new StringBuilder();
        int temp=0;
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                res.append(list.get(temp++));
            } else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();

    }
}
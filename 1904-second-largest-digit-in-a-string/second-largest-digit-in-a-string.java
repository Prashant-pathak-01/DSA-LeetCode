class Solution {
    public int secondHighest(String s) {
        int res= -1;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++) if(Character.isDigit(s.charAt(i)) && !list.contains(s.charAt(i)-'0')) list.add(s.charAt(i)-'0');
        Collections.sort(list);
        if(list.size()>1) res = list.get(list.size()-2);
        return res;
    }
}
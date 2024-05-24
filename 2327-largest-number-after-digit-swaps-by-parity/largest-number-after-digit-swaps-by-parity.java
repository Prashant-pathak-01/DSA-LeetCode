class Solution {
    public int largestInteger(int num) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        String str = String.valueOf(num);
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)-'0')%2==0) even.add((int)(str.charAt(i)-'0'));
            else odd.add((int)(str.charAt(i)-'0'));
        }
        Collections.sort(even);
        Collections.sort(odd);
        int x =even.size()-1,y=odd.size()-1;
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)-'0')%2==0) res.append(even.get(x--));
            else res.append(odd.get(y--));
        }
        return Integer.parseInt(res.toString());
    }
}
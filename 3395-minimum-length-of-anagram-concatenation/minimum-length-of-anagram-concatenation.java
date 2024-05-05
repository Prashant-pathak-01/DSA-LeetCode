class Solution {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public int gcdOfList(List<Integer> numbers) {
        if(numbers.isEmpty()) return 0;
        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = gcd(result, numbers.get(i));
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
    public boolean valid(int arr[]){
        for(int i=0; i<arr.length; i++) if(arr[i]!=0) return false;
        return true;
    }
    public int minAnagramLength(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        if(map.size()==s.length()) return s.length();
        List<Integer> list = new ArrayList<>(map.values());
        int gcd = gcdOfList(list);
        int arr[] = new int[26];
        for (char c : map.keySet()) {
            arr[Character.toLowerCase(c) - 'a'] = map.get(c) / gcd;
        }
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']--;
            if(valid(arr)) return i+1;
        }
        return 0;
    }
}
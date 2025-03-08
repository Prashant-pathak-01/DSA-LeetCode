class Solution {
    public int minimumOperations(String num) {
        Set<Character> set = new HashSet<>();
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i)=='0'){
                if(set.contains('0')) return num.length()-i-2;
                else set.add('0');
            }else if(num.charAt(i)=='5'){
                if(set.contains('0')) return num.length()-i-2;
                else set.add('5');
            }else if(num.charAt(i)=='2'){
                if(set.contains('5')) return num.length()-i-2;
            }else if(num.charAt(i)=='7'){
                if(set.contains('5')) return num.length()-i-2;
            }
        }
        return (set.contains('0'))? num.length()-1:num.length();
    }
}
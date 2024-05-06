class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int max =0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)) max  = Math.max(max,j);
            }
            if(i>=max) {
                list.add(i+1-sum);
                sum+=list.get(list.size()-1);
            }
        }
        return list;
    }
}
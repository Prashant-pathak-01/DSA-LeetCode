class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        for(int i=0; i<names.length; i++) map.put(heights[i],names[i]);
        Arrays.sort(heights);
        int k = names.length-1;
        for(int i=0; i<heights.length; i++) names[k--] = map.get(heights[i]);
        return names;
    }
}
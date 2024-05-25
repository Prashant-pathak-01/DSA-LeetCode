class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int res[] = new int[queries.length];
        Map<Integer, Integer> map = new HashMap<>(); 
        Map<Integer, Integer> colorCount = new HashMap<>(); 

        for (int i = 0; i < queries.length; i++) {
            int key = queries[i][0];
            int newColor = queries[i][1];
            if (map.containsKey(key)) {
                colorCount.put(map.get(key), colorCount.get(map.get(key)) - 1);
                if (colorCount.get(map.get(key)) == 0) {
                    colorCount.remove(map.get(key));
                }
            }

            map.put(key, newColor);
            colorCount.put(newColor, colorCount.getOrDefault(newColor, 0) + 1);

            res[i] = colorCount.size();
        }

        return res;
    }
}

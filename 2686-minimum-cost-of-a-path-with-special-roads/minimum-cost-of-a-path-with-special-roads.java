class Solution {
    class Pair{
        String node;
        int cost;
        Pair(String s,int c){
            node = s;
            cost = c;
        }
    }
    public int minimumCost(int[] start, int[] target, int[][] special) {
        Map<String,Integer> dist = new HashMap<>();
        dist.put(start[0]+"+"+start[1],0);
        dist.put(target[0]+"+"+target[1],Integer.MAX_VALUE);
        for(int i=0; i<special.length; i++){
            dist.put(special[i][0]+"+"+special[i][1],Integer.MAX_VALUE);
            dist.put(special[i][2]+"+"+special[i][3],Integer.MAX_VALUE);
        }

        Map<String,HashMap<String,Integer>> specialEdge = new HashMap<>();
        for(int i=0; i<special.length; i++){
            HashMap<String,Integer> costMap = specialEdge.getOrDefault(special[i][0]+"+"+special[i][1],new HashMap<>());
            costMap.put(special[i][2]+"+"+special[i][3],Math.min(costMap.getOrDefault(special[i][2]+"+"+special[i][3],Integer.MAX_VALUE),special[i][4]));
            specialEdge.put(special[i][0]+"+"+special[i][1],costMap);
            
        }
        

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new Pair(start[0]+"+"+start[1],0));
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            for(String key:dist.keySet()){
                String arr1[] = temp.node.split("\\+");
                String arr2[] = key.split("\\+");
                int newCost = Math.abs(Integer.parseInt(arr1[0])-Integer.parseInt(arr2[0]))+Math.abs(Integer.parseInt(arr1[1])-Integer.parseInt(arr2[1]));
                if(specialEdge.containsKey(temp.node) && specialEdge.get(temp.node).containsKey(key)){
                    newCost = Math.min(newCost,specialEdge.get(temp.node).get(key));
                }
                //System.out.println(temp.node+"  "+key+" "+newCost);
                if(dist.get(key)>temp.cost+newCost){
                    dist.put(key,temp.cost+newCost);
                    pq.add(new Pair(key,temp.cost+newCost));
                }
            }
        }
        //System.out.println(dist);
        return dist.get(target[0]+"+"+target[1]);

    }
}
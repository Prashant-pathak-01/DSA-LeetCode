class DinnerPlates {
    Map<Integer,List<Integer>> map;
    int cap;
    int indexA;
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int indexB;
    public DinnerPlates(int capacity) {
        map = new HashMap<>();
        cap = capacity;
        indexA = 0;
        indexB = 0;
    }
    
    public void push(int val) {
        if(!q.isEmpty() && q.peek()>indexA) q.clear();
        if(!q.isEmpty()){
            int temp = q.poll();
            List<Integer> list = map.get(temp);
            list.add(val);
        }else{
            List<Integer> list = map.getOrDefault(indexA,new ArrayList<>());
            if(list.size()==cap) {
                indexA++;
                list = map.getOrDefault(indexA,new ArrayList<>());
            }
            list.add(val);
            map.put(indexA,list);
            indexB = indexA;
        }
    }
    
    public int pop() {
        while(indexB>0 && map.get(indexB).size()==0) indexB--;
        if(indexB==0 && map.get(indexB).size()==0) return -1;
        List<Integer> list = map.get(indexB);
        int res = list.remove(list.size()-1);
        map.put(indexB,list);
        indexA = indexB;
        return res;
    }
    
    public int popAtStack(int index) {
        if(!map.containsKey(index) || map.get(index).size()==0) return -1;
        List<Integer> list = map.get(index);
        int res = list.remove(list.size()-1);
        map.put(index,list);
        q.add(index);
        return res;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(indexA);
 */
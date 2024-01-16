class RandomizedSet {
    List<Integer> list;
    public RandomizedSet() {
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(list.contains(val)) return false;
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!list.contains(val)) return false;
        list.remove(list.indexOf(val));
        return true;
    }
    
    public int getRandom() {
        System.out.println((int)(Math.random()*list.size()));
        return list.get((int)(Math.random()*list.size()));
    }
}

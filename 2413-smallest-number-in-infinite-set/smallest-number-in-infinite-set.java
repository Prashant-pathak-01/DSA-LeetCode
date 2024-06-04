class SmallestInfiniteSet {
    Set<Integer> set ;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
    }
    
    public int popSmallest() {
        int i =1;
        while(true){
            if(!set.contains(i)) {
                set.add(i);
                return i;
            }
            i++;
        }
    }
    
    public void addBack(int num) {
        set.remove(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
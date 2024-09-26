class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min = new PriorityQueue<>((a,b)->a-b);
        max = new PriorityQueue<>((a,b)->b-a);
    }
    
    public void addNum(int num) {
        if(min.size()==max.size()){
            max.add(num);
            min.add(max.poll());
        }else{
            min.add(num);
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(min.size()==max.size()) return (double)(min.peek()+max.peek())/2;
        else return min.peek();
    }
}

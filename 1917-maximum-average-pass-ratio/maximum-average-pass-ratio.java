class Solution {
    class Pair{
        int total;
        int pass;
        double avg;
        Pair(int total, int pass, double avg){
            this.total = total;
            this.avg = avg;
            this.pass = pass;
        }
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Double.compare(a.avg,b.avg));
        for(int i=0; i<classes.length; i++){
            double diff = (double)(classes[i][0])/(classes[i][1])-(double)(classes[i][0]+1)/(classes[i][1]+1);
            pq.add(new Pair(classes[i][1],classes[i][0],diff));
        }
        while(extraStudents-->0){
            Pair temp = pq.poll();
            temp.total++;
            temp.pass++;
            double diff = (double)(temp.pass)/(temp.total)-(double)(temp.pass+1)/(temp.total+1);
            pq.add(new Pair(temp.total,temp.pass,diff));
        }
        double res= 0;
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            res+=(double)temp.pass/temp.total;
        }
        return res/classes.length;
    }
}
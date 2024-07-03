class SegmentTree{
    int tree[];
    SegmentTree(int n){
        tree = new int[n*4];
    }
    public void build(int node, int arr[], int i, int j){
        if(i==j) {
            tree[node] = arr[i];
            return;
        }
        int mid = (i+j)/2;
        build(node*2+1,arr,i,mid);
        build(node*2+2,arr,mid+1,j);
        tree[node] = tree[node*2+1]+tree[node*2+2];
    }
    public void update(int indx, int node, int i, int j, int val) {
        if (i == j) {
            tree[node] = val;
            return;
        }
        int mid = (i + j) / 2;
        if (indx <= mid)
            update(indx, 2 * node + 1, i, mid, val);
        else
            update(indx, 2 * node + 2, mid + 1, j, val);
        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }
     public int query(int node, int i, int j, int l, int r) {
        if (i > r || j < l)
            return 0;
        if (i >= l && j <= r)
            return tree[node];
        int mid = (i + j) / 2;
        int left = query(2 * node + 1, i, mid, l, r);
        int right = query(2 * node + 2, mid + 1, j, l, r);
        return left + right;
    }
}
class NumArray {
    SegmentTree tree;
    int len;
    public NumArray(int[] nums) {
        tree = new SegmentTree(nums.length);
        len = nums.length-1;
        tree.build(0,nums,0,len);
    }
    
    public void update(int index, int val) {
        tree.update(index,0,0,len,val);
    }
    
    public int sumRange(int left, int right) {
        return tree.query(0,0,len,left,right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(tree);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
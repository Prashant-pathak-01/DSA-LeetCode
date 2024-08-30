class Solution {
    public int check(int a[], int i, int n, int tar){
        for(int x = i; x<=n; x++) if(a[x]==tar) return x;
        return -1;
    }
    int x;
    public TreeNode generate(int a[], int b[], int i, int n){
        if(x<0 || i>n) return null;
        if(i==n) return new TreeNode(b[x--]);
        TreeNode root = new TreeNode(b[x]);
        int check = check(a,i,n,b[x]);
        x--;
        root.right = generate(a,b,check+1,n);
        root.left = generate(a,b,i,check-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        x = postorder.length-1;
        return generate(inorder, postorder,0,inorder.length-1);
    }
}
class SegmentTree {
    int size;
    int nums[];

    SegmentTree(int n) {
        nums = new int[n * 4];
    }

    public void build(int peaks[], int node, int i, int j) {
        if (i == j) {
            nums[node] = peaks[i];
            return;
        }

        int mid = (i + j) / 2;
        build(peaks, 2 * node + 1, i, mid);
        build(peaks, 2 * node + 2, mid + 1, j);
        nums[node] = nums[2 * node + 1] + nums[2 * node + 2];
    }

    public void update(int indx, int node, int i, int j, int val) {
        if (i == j) {
            nums[node] = val;
            return;
        }
        int mid = (i + j) / 2;
        if (indx <= mid)
            update(indx, 2 * node + 1, i, mid, val);
        else
            update(indx, 2 * node + 2, mid + 1, j, val);
        nums[node] = nums[2 * node + 1] + nums[2 * node + 2];
    }

    public int query(int node, int i, int j, int l, int r) {
        if (i > r || j < l)
            return 0;
        if (i >= l && j <= r)
            return nums[node];
        int mid = (i + j) / 2;
        int left = query(2 * node + 1, i, mid, l, r);
        int right = query(2 * node + 2, mid + 1, j, l, r);
        return left + right;
    }
}

class Solution {
    public List<Integer> countOfPeaks(int[] nums, int[][] queries) {
        int n = nums.length;
        int peaks[] = new int[n];
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                peaks[i] = 1;
            }
        }
        List<Integer> res = new ArrayList<>();
        SegmentTree tree = new SegmentTree(n);
        tree.build(peaks, 0, 0, n - 1);

        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 1) {
                int start = queries[i][1];
                int end = queries[i][2];
                if (start == end || start + 1 == end) {
                    res.add(0);
                } else {
                    res.add(tree.query(0, 0, n - 1, start + 1, end - 1));
                }
            } else {
                int idx = queries[i][1];
                int val = queries[i][2];
                nums[idx] = val;
                
                int updateStart = Math.max(1, idx - 1);
                int updateEnd = Math.min(n - 2, idx + 1);
                for (int j = updateStart; j <= updateEnd; j++) {
                    int peaksVal = (nums[j] > nums[j - 1] && nums[j] > nums[j + 1]) ? 1 : 0;
                    tree.update(j, 0, 0, n - 1, peaksVal);
                }
            }
        }

        return res;
    }
}

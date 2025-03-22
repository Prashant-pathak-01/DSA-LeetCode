class Solution {
public:
    int countCompleteComponents(int n, vector<vector<int>>& edges) {
        map<int,vector<int>> map;
        for(auto i: edges){
            map[i[0]].push_back(i[1]);
            map[i[1]].push_back(i[0]);
        }
        int res =0;
        vector<bool>visited(n,false);
        for(int i=0; i<n; i++){
            if(visited[i]!=true){
                queue<int> q;
                q.push(i);
                bool flag = true;
                int req = map[i].size();
                int count =0;
                while(!q.empty()){
                    int temp = q.front();
                    q.pop();
                    if(map[temp].size()!=req) flag = false;
                    visited[i] = true;
                    for(auto x:map[temp]){
                        if(!visited[x]){
                            count++;
                            visited[x] = true;
                            q.push(x);
                        }
                    }
                }
                if(flag && count==req) res++;
            }
        }
        return res;
    }
};
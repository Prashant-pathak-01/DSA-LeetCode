struct Compare{
    bool operator()( const pair<long long,long long> a, const pair<long long,long long> b){
        return a.second>b.second;
    }
};

class Solution {
public:
    int countPaths(int n, vector<vector<int>>& roads) {
        vector<vector<pair<long long, long long>>> map(n);
        for(auto path:roads){
            map[path[0]].push_back({path[1],path[2]});
            map[path[1]].push_back({path[0],path[2]});
        }
        priority_queue<pair<long long, long long>,vector<pair<long long, long long>>, Compare> pq;
        pq.push({0,0});
        vector<long long> max_dist(n,LLONG_MAX);
        max_dist[0] = 0;
        vector<long long> max_ways(n,0);
        max_ways[0] = 1;
        int mod = 1e9+7;
        while(!pq.empty()){
            pair<long long, long long> temp = pq.top();
            pq.pop();
            if(max_dist[temp.first]<temp.second) continue;
            for(auto i:map[temp.first]){
                    if(temp.second+i.second<max_dist[i.first]){
                        pq.push({i.first, temp.second+i.second});
                        max_dist[i.first] = temp.second+i.second;
                        max_ways[i.first] = max_ways[temp.first];
                        
                    }else if(temp.second+i.second==max_dist[i.first]) max_ways[i.first] = (max_ways[i.first] +max_ways[temp.first])%mod;
            }

        }
        return max_ways[n-1]%mod;
    }
};
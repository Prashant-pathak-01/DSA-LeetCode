class Solution {
public:
    int totalNumbers(vector<int>& digits) {
        set<int> set;
        int res= 0;
        for(int i=0; i<digits.size(); i++){
            if(digits[i]==0) continue;
            for(int j=0; j<digits.size(); j++){
                if(i==j) continue;
                for(int k=0; k<digits.size(); k++) {
                    if(digits[k]%2==0 && k!=j && k!=i) set.insert((digits[i]*100)+(digits[j]*10)+digits[k]);
                }
            }
        }
        for(auto i:set) cout<<i<<"\n";
        return set.size();
    }
};
class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        int gasCount = 0;
        int start=0;

        for(int i=0;i<n;i++)
        {
            gasCount+=gas[i]-cost[i];
            if(gasCount<0){
                start = i+1;
                gasCount = 0;
            }
        }
        int totalGas=0;
        int totalCost=0;

        for(int i=0;i<n;i++)
        {
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalGas<totalCost) return -1;
        return start;
    }
};
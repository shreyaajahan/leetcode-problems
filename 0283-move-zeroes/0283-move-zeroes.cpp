class Solution {
public:
    void swap(int &r1,int &r2)
    {
        int t;
        t=r1;
        r1=r2;
        r2=t;
    }
    void moveZeroes(vector<int>& arr) {
        int n = arr.size();
        int zi=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] !=0)
            swap(arr[i],arr[zi++]);
        }
    }
};
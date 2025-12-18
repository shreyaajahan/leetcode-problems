class Solution {
public:
int count = 0;
void dfs(vector<vector<int>>& grid,int r,int c)
{
    if(r<0 || c<0 || r>=grid.size() || c>=grid[0].size() || grid[r][c]==0) return;
    count++;
    grid[r][c]=0;
    dfs(grid,r,c+1);
    dfs(grid,r+1,c);
    dfs(grid,r,c-1);
    dfs(grid,r-1,c);
}
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int max=0;
        for(int i=0;i<grid.size();i++)
        {
            for(int j=0;j<grid[0].size();j++)
            {
                if(grid[i][j]==1)
                {
                    count = 0;
                    dfs(grid,i,j);
                    if(count>max) max=count;
                }
            }
        }
        return max;
    }
};
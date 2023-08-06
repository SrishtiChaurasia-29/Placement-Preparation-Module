class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0)
            return 0;
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m; i++)
        {
            for(int j=0;j<n; j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    merge(grid, i, j);
                }
            }
        }
        return count;
    }
    public void merge(char[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)
            return;
        if(grid[i][j]=='1') 
        {
            grid[i][j]='0';
            merge(grid, i-1,j);
            merge(grid, i+1,j);
            merge(grid, i,j-1);
            merge(grid, i,j+1);
        }
    }
}
class Day17 {
    public int numIslands(char[][] grid) {
        if (grid.length  == 0) {
            return 0;
        }
        
        int m = grid.length, n = grid[0].length;
        int numIslands =  0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m;  i++) {
            for  (int j  =  0; j  < n;  j++)  {
                if  (grid[i][j]  == '1' && !visited[i][j]) {
                    valid(grid, m, n,  i, j, visited);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    
    void  valid(char[][] grid, int m, int n,int i, int j, boolean[][]  visited) {
        if (i  >= m  ||  j  >=  n ||  i < 0 || j < 0 || grid[i][j] == '0' || visited[i][j]) {
            return;
        }
        visited[i][j]  = true;
        valid(grid, m, n, i+1, j, visited);
        valid(grid, m, n, i, j+1 ,visited);
        valid(grid, m, n, i-1, j, visited);
        valid(grid, m, n, i, j-1, visited);
            
    }
}

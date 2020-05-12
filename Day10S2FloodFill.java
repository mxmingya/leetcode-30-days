class Day10S2FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalCol = image[sr][sc];
        int m = image.length, n = image[0].length;
        boolean[][] res = new boolean[m][n];
        dfs(image, m, n, sr, sc, newColor, originalCol, res);
        return image;
        
    }
    private void dfs(int[][] image, int m, int n, int i, int j, int newColor, int originalCol, boolean[][] res) {
        if (i < 0 || i >= m || j < 0 || j >= n || image[i][j] != originalCol || res[i][j] ) {
            return;
        }
        image[i][j] = newColor;
        res[i][j] = true;
        // System.out.printf("%d %d \n",i,j);
        dfs(image, m,n,i+1,j,newColor, originalCol, res);
        dfs(image, m,n,i-1,j,newColor, originalCol, res);
        dfs(image, m,n,i,j+1,newColor, originalCol, res);
        dfs(image, m,n,i,j-1,newColor, originalCol, res);
    } 
}

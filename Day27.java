class Day27 {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        // 1 1 1 1 1
        // 1 1 1 1 1
        // 1 1 1 2 2
        // 1 1 1 1 1
        
//         for (int i = 0; i < n; i++) {
//             dp[0][n] = matrix[0][i] == '1' ? 1 : 0;
//         }
//         for (int i = 0; i < matrix.length; i++) {
//             dp[i][0] = matrix[i][0] == '1' ? 1 : 0;
//         }
        dp[0][0] = matrix[0][0] == '1' ? 1 : 0;
        int res = dp[0][0];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    res = Math.max(dp[i][j], res);
                }
            }
        }
        return res * res;
    }
}

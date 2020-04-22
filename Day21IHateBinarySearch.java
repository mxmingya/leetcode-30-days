/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Day21 {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        // binary search
        List<Integer> di = binaryMatrix.dimensions();
        int m = di.get(0), n = di.get(1);
        int[] dp = new int[m];
        boolean flag = false;
        int res = n-1;
        for (int i = 0; i < m; i++) {
            for (int j = res; j >= 0; j--) {
                if (binaryMatrix.get(i, j) == 0) {
                    // skip this row
                    break;
                }
                else if (binaryMatrix.get(i, j) == 1 ) {
                    res = Math.min(res, j);
                    flag = true;
                }
            }
            dp[i] = res;
        }
        return flag ? res : -1;
    }
}

class Day3 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int curMax = nums[0], res = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (curMax < 0) {
                curMax = 0;
            }
            curMax = curMax + nums[i];
            res = Math.max(res, curMax);
        }
        return res;
    }
}

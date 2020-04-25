class Day25 {
    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums.length == 1 && nums[0] == 0) {
            return true;
        } 
        int res = 0, len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i] + i;
            if (res < i) {
                return false;
            }
            res = res >= cur ? res : cur;
        }
        return res >= len-1;
    
    }
}

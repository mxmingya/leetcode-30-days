class Day15 {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int len = nums.length;
        int[] res = new int[len];
        if (nums.length == 0) {
            return res;
        }
        
        left[0] = 1;
        right[nums.length-1] = 1;
        
        for (int i = 1; i < len; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        
        for (int i = 0; i < len; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}

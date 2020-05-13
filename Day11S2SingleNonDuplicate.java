class Day11S2SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            first ^= nums[i];
        }
        return first;
    }
}

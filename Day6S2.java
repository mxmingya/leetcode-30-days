class Day6S2 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length == 0) {
            return -1;
        }
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int len = nums.length;

        for (int i  : nums ) {
            if (map.get(i) >= (len + 1) / 2) {
                return i;
            }
        }
        return -1;
    }
}

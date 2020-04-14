class Day13 {
    public int findMaxLength(int[] nums) {
        // map:  sum  ->  indexOfLastSum in array
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length == 0) {
            return 0;
        }
        // put a dummy value for situation like [0,1] 
        map.put(0, -1);
        // sum是array里0和1出现的次数总和，如果是1，加1，如果是0，减1，这样的话当同样的sum再次出现的话我们就知道array里面0和1的数量是一样的。
        int maxLength = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum++;
            } else  {
                sum--;
            }
            if (map.containsKey(sum)) {
               maxLength = Math.max(maxLength, i-map.get(sum));
            } else {
                map.put(sum,  i);
            }
        }
        
        return maxLength;
    }
}

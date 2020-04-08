class Day7 {
    public int countElements(int[] arr) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,  map.getOrDefault(i,0)+1);
        }
        for (int i : arr) {
            if (map.containsKey(i+1) && map.get(i+1) > 0) {
                res++;
                // map.put(i+1, map.get(i+1)-1);
            }
        }
        return res;
    }
}

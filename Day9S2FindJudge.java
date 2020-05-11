class Day9S2FindJudge {
    public int findJudge(int N, int[][] trust) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashMap<Integer, List<Integer>> map2 = new HashMap<>();
        if (trust.length == 0) {
            return 1;
        }
        for (int[] ppl : trust) {
            if (!map.containsKey(ppl[0])) {
                map.put(ppl[0], new LinkedList<>());
            }
            map.get(ppl[0]).add(ppl[1]);
            if (!map2.containsKey(ppl[1])) {
                map2.put(ppl[1], new LinkedList<>());
            }
            map2.get(ppl[1]).add(ppl[0]);
        }
        for (int i = 1; i <= N; i++) {
            if (!map.containsKey(i) && map2.containsKey(i) && map2.get(i).size() == N - 1) {
                return i;
            }
        }
        return -1;
    }
}

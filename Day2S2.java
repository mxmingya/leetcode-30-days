class Day2S2 {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        if (J.length() == 0 || S.length() == 0) {
            return 0;
        }
        int numJew = 0;
        for (char c : J.toCharArray()) {
            map.put(c, 0);
        }
        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                numJew++;
            }
        }
        return numJew;
    }
}

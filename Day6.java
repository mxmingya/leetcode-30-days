class Day6 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList<>();
        if (strs.length == 0) {
            return res;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());
                
            } 
            map.get(sorted).add(word);
        }
        for (String key : map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    }
}

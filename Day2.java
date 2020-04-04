class Day2 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        if (n == 1) {
            return true;
        }
        while (n > 1) {
            int temp = 0;
            while (n > 0) {
                int cur = n % 10;
                temp += cur * cur;
                n /= 10;
            }
            if (temp == 1) {
                return true;
            }
            if (set.contains(temp)) {
                return false;
            } else {
                set.add(temp);
                n = temp;
            }
            
        }
        return false;
    }
    
}

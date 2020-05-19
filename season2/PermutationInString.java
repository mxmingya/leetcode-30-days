class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int sh = s1.length();
        int lo = s2.length();
        if (sh == 0 || lo == 0 || sh > lo) {
            return false;
        }
        int[] count = new int[256];
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
        for (int i = 0; i < sh; i++) {
            count[c1[i]]++;
            count[c2[i]]--;
        }
        if (allzero(count)) {
            return true;
        }
        for (int i = sh; i < lo; i++) {
            count[c2[i]]--;
            count[c2[i-sh]]++;
            if (allzero(count)) return true;
        }
        return false;
    }
    
    public boolean allzero(int[] count) {
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

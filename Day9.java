class Day9 {
    public boolean backspaceCompare(String S, String T) {
        // if (S.length() != T.length()) {
        //     return false;
        // }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#' && s1.length() != 0) {
                s1.deleteCharAt(s1.length()-1);
            } else if (S.charAt(i) != '#') {
                s1.append(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#' && s2.length() > 0) {
                s2.deleteCharAt(s2.length()-1);
            } else if (T.charAt(i) != '#') {
                s2.append(T.charAt(i));
            }
        }
        return s1.toString().equals(s2.toString());
    }
}

class Day16 {
    public boolean checkValidString(String s) {
        if (s.length() == 0) {
            return true;
        }
        int min = 0, max = 0;
        // if ( both boundary plus 1, if ) both boundary mins 1, except low bountry is too low(equals 0), meaning low bountry has no * to spare. and high bountry can never be lower than 0, then low bountry need equals 0 to be a solution. 
        for (char c : s.toCharArray()) {
            if (c == '(') {
                min++;
                max++;
            } else if (c == ')') {
                if (min > 0) {
                    min--;
                }
                max--;
            } else {
                // * 
                if (min > 0) {
                    min--; // if need ) can be )
                }
                max++; // can be ( 
            }
            if (max < 0) {
                return false;
            }
        }
       return min == 0;
    }
}

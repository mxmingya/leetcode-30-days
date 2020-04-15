class Day14 {
    public String stringShift(String s, int[][] shift) {
        StringBuilder sb = new StringBuilder(s);
        if (s.length() == 0) {
            return sb.toString();
        }
        for (int i = 0; i < shift.length; i++) {
            int[] curShift = shift[i];
            if (curShift[0] == 0) {
                //left shift remove first char and append to the end
                while (curShift[1] > 0) {
                    char curChar = sb.charAt(0);
                    sb.deleteCharAt(0);
                    sb.append(curChar);
                    curShift[1]--;
                }
                
            } 
            else if (curShift[0] == 1) {
                while (curShift[1] > 0) {
                    char curChar = sb.charAt(sb.length()-1);
                    sb.deleteCharAt(sb.length()-1);
                    sb.insert(0, curChar);
                    curShift[1]--;
                }
            }
        }
        return sb.toString();
        
    }
}

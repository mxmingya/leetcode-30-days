class Day8S2CheckIfStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 0) {
            return false;
        }
        
        int len = coordinates.length;
        if (len  == 1) {
            return true;
        }
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0],  y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        
        for (int i = 0; i < len; i++) {
            boolean slope = (coordinates[i][1]-y0) * dx == dy  * (coordinates[i][0]-x0);
            if (!slope) {
                return false;
            }
        }
        return true;
    }
}

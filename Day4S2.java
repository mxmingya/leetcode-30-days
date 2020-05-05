class Day4S2 {
    public int findComplement(int num) {
        double res = 0;
        int count = 0;
        while (true) {
            res += Math.pow(2.0, count);
            if (res >= num) {
                break;
            }
            count++;
        }
        return (int)res - num;
    }
}

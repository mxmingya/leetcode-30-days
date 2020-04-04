class Day4 {
    public void moveZeroes(int[] nums) {
        int positionWithOutZero = 0;
        
        // two pointers
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[positionWithOutZero] = nums[i];
                positionWithOutZero++;
            }
            i++;
        }
        while (positionWithOutZero < nums.length) {
            nums[positionWithOutZero] = 0;
            positionWithOutZero++;
        }
    }
}

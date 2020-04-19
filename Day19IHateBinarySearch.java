class Day19IHateBinarySearch {
    public int search(int[] nums, int target) {
        // how fast is this..
        if (nums.length == 0) {
            return -1;
        }
        // find the rotation point, and perform two binary search
        // binary search to find the rotation point
        int len = nums.length, rotationPoint = -1;
        int start = 0, end = len-1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && nums[end] >= target) {
                     start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        int res = -1;
        if (nums[start] == target) {
            return start;
        } 
        if (end > 0 && nums[end] == target) {
            return end;
        }
        return res;
    }
}

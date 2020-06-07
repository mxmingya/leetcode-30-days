class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        start = 0;
        res = 0;
        while start < len(nums):
            # find next start where start == 1
            end = start;
            if nums[start] == 0:
                start = start + 1;
                continue;
            else:
                while end < len(nums) and nums[end] == 1:
                    # print(" end: ", end)
                    end = end + 1
            cur = end - start
            # if end + 1 < len(nums):
            start = end + 1
            res = res if res > cur else cur
        return res

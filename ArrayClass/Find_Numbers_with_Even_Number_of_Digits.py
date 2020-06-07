class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        tens = [10, 1000, 100000, 10000000, 1000000000, 100000000000]
        # divide by any of these and return single digit(< 10) has even number of digits
        res = 0
        for num in nums:
            for ten in tens:
                cur = num / ten
                if cur < 10 and cur >= 1:
                    # print("cur: ", cur, "ten: ", ten)
                    res += 1
                    break
                elif cur == 0 or (cur >= 10 and cur <= 100):
                    break;
                    
        return res

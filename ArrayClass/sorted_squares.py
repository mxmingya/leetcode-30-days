class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        res = []
        for a in A:
            res.append(a * a)
        res.sort()
        return res

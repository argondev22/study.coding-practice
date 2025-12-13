class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        candidate = nums[0]
        score = 1

        for i in range(1, len(nums)):
            # 1: nums=[2,2,1,1,1,2,2], i=1, candidate=2, score=1
            # 3: nums=[2,2,1,1,1,2,2], i=2, candidate=2, score=2
            # 5: nums=[2,2,1,1,1,2,2], i=3, candidate=2, score=1
            # 6: nums=[2,2,1,1,1,2,2], i=4, candidate=2, score=0
            # 8: nums=[2,2,1,1,1,2,2], i=5, candidate=1, score=1
            # 10: nums=[2,2,1,1,1,2,2], i=6, candidate=1, score=0
            if score == 0:
                score = 1
                candidate = nums[i]
                # 7: nums=[2,2,1,1,1,2,2], i=4, candidate=1, score=1
                # 11: nums=[2,2,1,1,1,2,2], i=6, candidate=2, score=1
            elif nums[i] == candidate:
                score = score + 1
                # 2: nums=[2,2,1,1,1,2,2], i=1, candidate=2, score=2
            else:
                score = score -1
                # 4: nums=[2,2,1,1,1,2,2], i=2, candidate=2, score=1
                # 6: nums=[2,2,1,1,1,2,2], i=3, candidate=2, score=0
                # 9: nums=[2,2,1,1,1,2,2], i=5, candidate=1, score=0

        # 11: candidate=2
        return candidate

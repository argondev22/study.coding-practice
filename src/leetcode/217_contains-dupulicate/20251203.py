class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # edge case
        if len(nums) == 1:
            return False

        dict = {}

        # liner scanning
        for num in nums:
            # return true if dupulicate is
            if num in dict:
                return True

            dict[num] = True

        # return false
        return False

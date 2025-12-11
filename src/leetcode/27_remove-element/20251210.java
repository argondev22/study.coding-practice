class Solution {
    // input: nums = [3, 2, 2, 3], val = 3
    // output: nums = [2, 2, _, _], return 2
    public int removeElement(int[] nums, int val) {
        int runnerIndex = 0;
        int staticIndex = 0;

        // 1: nums = [3, 2, 2, 3], runnerIndex = 0, staticIndex = 0, val = 3
        // 3: nums = [3, 2, 2, 3], runnerIndex = 1, staticIndex = 0, val = 3
        // 6: nums = [2, 3, 2, 3], runnerIndex = 2, staticIndex = 1, val = 3
        // 9: nums = [2, 2, 3, 3], runnerIndex = 3, staticIndex = 2, val = 3
        // 11: nums = [2, 2, 3, 3], runnerIndex = 4, staticIndex = 2, val = 3
        while (runnerIndex < nums.length) {
            // 2: nums = [3, 2, 2, 3], runnerIndex = 0, staticIndex = 0, val = 3
            // 4: nums = [3, 2, 2, 3], runnerIndex = 1, staticIndex = 0, val = 3
            // 7: nums = [2, 3, 2, 3], runnerIndex = 2, staticIndex = 1, val = 3
            // 10: nums = [2, 2, 3, 3], runnerIndex = 3, staticIndex = 2, val = 3
            if (nums[runnerIndex] == val) {
                runnerIndex++;
                continue;
            }

            int tmp = nums[staticIndex];
            nums[staticIndex] = nums[runnerIndex];
            nums[runnerIndex] = tmp;

            runnerIndex++;
            staticIndex++;
            // 5: nums = [2, 3, 2, 3], runnerIndex = 2, staticIndex = 1, val = 3
            // 8: nums = [2, 2, 3, 3], runnerIndex = 3, staticIndex = 2, val = 3
        }

        return staticIndex;
    }
}

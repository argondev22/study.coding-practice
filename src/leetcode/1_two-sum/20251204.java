class Solution {
    public int[] twoSum(int[] nums, int target) {
        // edge case
        if (nums.length == 2) {
            return new int[]{0, 1};
        }

        // map init
        Map<Integer, Integer> map = new HashMap<>();

        // liner scanning
        for (Integer i = 0; i < nums.length; i++) {
            Integer n = target - nums[i];
            if (map.containsKey(n)) {
                return new int[]{map.get(n), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}

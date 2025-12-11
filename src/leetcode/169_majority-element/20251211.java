class Solution {
    public int majorityElement(int[] nums) {
        // 1: nums = [3,2,3] 
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        double targetCount = nums.length / 2;

        for (int num : nums) {
            // 2: nums = [3,2,3] map = {} 
            // 4: nums = [3,2,3] map = {(3,1)} 
            // 5: nums = [3,2,3] map = {(3,1),(2,1)} 
            if (map.containsKey(num)) {
                map.compute(num, (k, v) -> v + 1);
                // 6: nums = [3,2,3] map = {(3,2),(2,1)} 

                int count = map.get(num);
                // 6: nums = [3,2,3] map = {(3,2),(2,1)} count = 2
                if (count > targetCount) {
                    return num;
                }
            } else {
                map.put(num, 1);
                // 3: nums = [3,2,3] map = {(3,1)} 
                // 4: nums = [3,2,3] map = {(3,1),(2,1)} 
            }
        }

        return -1;
    }
}

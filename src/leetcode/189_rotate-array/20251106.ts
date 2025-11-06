/**
 Do not return anything, modify nums in-place instead.
 */
export function rotate(nums: number[], k: number): void {
    for (let i = 0; i < nums.length; i++) {
        if (i + k < nums.length) {
            const transferedIndex = i + k;
            nums[transferedIndex] = nums[i];
        } else {
            const transferedIndex = i + k - nums.length;
            nums[transferedIndex] = nums[i];
        }
    }
};

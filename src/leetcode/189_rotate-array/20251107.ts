/**
 Do not return anything, modify nums in-place instead.
 */
export function rotate(nums: number[], k: number): void {
    const n = nums.length;
    k = k % n;

    nums = reverse(nums, 0, n - 1);
    nums = reverse(nums, 0, k - 1);
    nums = reverse(nums, k, n - 1);
};

function reverse(nums: number[], startIndex: number, endIndex: number): number[] {
    while (startIndex < endIndex) {
        [nums[endIndex], nums[startIndex]] = [nums[startIndex], nums[endIndex]];

        startIndex++;
        endIndex--;
    }
    return nums;
}

export function removeElement(nums: number[], val: number): number {
    const removedNum = -1;
    let i = nums.length - 1;
    let j = nums.length - 1;

    while (i >= 0) {
        if (nums[i] === val) {
            if (i === j) {
                nums[j] = removedNum;
            } else {
                nums[i] = nums[j];
                nums[j] = removedNum;
            }
            j--;
        }
        i--;
    }

    return j + 1;
};

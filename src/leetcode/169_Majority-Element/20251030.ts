export function majorityElement(nums: number[]): number {
    if (nums.length <= 2) {
        return nums[0]
    }

    const arr1 = [nums[0]]
    const arr2 = [] 
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== arr1[0]) {
            arr2.push(nums[i])
        } else {
            arr1.push(nums[i])
        }
    }

    if (arr1.length > nums.length / 2) {
        return arr1[0]
    } else {
        return arr2[0]
    }
};

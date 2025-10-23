/**
 Do not return anything, modify nums1 in-place instead.
 */
 export function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    for (let i = 0; i < n; i++) {
        nums1[m + i] = nums2[i];
    }

    for (let i = 0; i < m + n; i++) {
        for (let j = 0; j < m + n; j++) {
            const preElement = nums1[j];
            const postElement = nums1[j + 1];
            if (preElement > postElement) {
                nums1[j] = postElement;
                nums1[j + 1] = preElement;
            }
        }
    }
};

/**
 * Status: Accepted
 * Time taken: 1 h 20 m 22 s
 */